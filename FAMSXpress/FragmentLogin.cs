using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Util;
using Android.Views;
using Android.Widget;
using System.Data;
using System.Threading;

namespace FAMSXpress
{
    public class FragmentLogin : Fragment
    {
        ProgressDialog progress;
        public override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);            

            // Create your fragment here
        }

        public override View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            // Use this to return your custom view for this Fragment
            View view = inflater.Inflate(Resource.Layout.LoginFragment, container, false);
            progress = new ProgressDialog(this.Context);
            Button buttonLogin = view.FindViewById<Button>(Resource.Id.buttonLogin);
            buttonLogin.Click += new EventHandler(buttonLogin_click);
            

            return view;
            //return base.OnCreateView(inflater, container, savedInstanceState);
        }

        public void buttonLogin_click(object sender, EventArgs e)
        {
            SqlConnection sqlcon = new SqlConnection(); //Create a new sql connection to retrieve data from web service
            progress = ProgressDialog.Show(this.Context, "", "Loading");
            new Thread(new ThreadStart(() => {

                try
                {
                    DataTable dt = sqlcon.getSqlInfo("Android_getUserId", "csd,csd123").Tables[0]; // Get the user Id from the database

                    if (dt.Rows.Count >= 1)
                    {
                        Sessions.SetUserId(int.Parse(dt.Rows[0].ItemArray[0].ToString())); // Save the user id in the Session class for later retrieval

                        DataTable dtSites = sqlcon.getSqlInfo("Android_getSites", Sessions.GetUserId().ToString()).Tables[0]; // Retrieve the sites for the user from the database

                        List<Site> lsSites = new List<Site>(); // Create a list of Sites to store the user's sites

                        if (dtSites.Rows.Count >= 1)
                        {
                            foreach (DataRow row in dtSites.Rows) // Loop through the rows in the dataset
                            {
                                int siteId = int.Parse(row.ItemArray[0].ToString());
                                int companyId = int.Parse(row.ItemArray[1].ToString());
                                string siteName = row.ItemArray[2].ToString();
                                string latitude = row.ItemArray[3].ToString();
                                string longitude = row.ItemArray[4].ToString();

                                Site site = new Site(siteId, companyId, siteName, latitude, longitude); // Create a new site with the data from the database
                                lsSites.Add(site); // Add the site to the list
                            }

                            Sessions.SetSites(lsSites); // Save the list of sites to the Sessions calss
                        }

                        if (lsSites.Count == 1) // Check if the is only one site in the Site list, if so just load the home page, else load the site selection page
                        {
                            Sessions.SetSiteId(lsSites[0].siteId);
                            Looper.Prepare();
                            FragmentHome home = new FragmentHome();                            
                            FragmentTransaction transact = FragmentManager.BeginTransaction();
                            transact.Replace(Resource.Id.frameLayout1, home);
                            transact.AddToBackStack("Login");
                            transact.Commit();
                        }
                        else
                        {
                            Looper.Prepare();
                            FragmentSiteSelect ss = new FragmentSiteSelect();                            
                            FragmentTransaction transact = FragmentManager.BeginTransaction();
                            transact.Replace(Resource.Id.frameLayout1, ss);
                            transact.AddToBackStack("Login");
                            transact.Commit();
                        }

                    }
                }
                catch (Exception error2)
                {
                    
                }

                progress.Dismiss();
            })).Start();

               

                     
                        
        }
        
    }
}