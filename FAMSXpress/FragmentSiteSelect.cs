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


namespace FAMSXpress
{
    public class FragmentSiteSelect : ListFragment
    {
        List<Site> sites;
        public override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Create your fragment here
        }

        public override View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            // Use this to return your custom view for this Fragment
            View view = inflater.Inflate(Resource.Layout.SiteSelectFragment, container, false);
            
            sites = Sessions.GetSites(); //Get the sites that belong to the user
            List<String> siteNames = new List<string>(); //Create a list to populate the listview with the siteNames
            foreach (Site item in sites)
            {
                siteNames.Add(item.siteName);               
            }
                       
            
            ListAdapter = new ArrayAdapter<String>(this.Context, Android.Resource.Layout.SimpleListItem1, siteNames); //Create the ListAdapter to populate the listview
                       


            return view;
           // return base.OnCreateView(inflater, container, savedInstanceState);
        }

        public override void OnListItemClick(ListView l, View v, int position, long id)
        {
            int selectedsiteId = sites[(int)id].siteId; //Get the id of the site that was selected on the listview

            Sessions.SetSiteId(selectedsiteId); //Set the site id in the Sessions class
                        
            FragmentHome home = new FragmentHome(); //Load the new fragment and add the current one to the backstack
            FragmentTransaction transact = FragmentManager.BeginTransaction();
            transact.Replace(Resource.Id.frameLayout1, home);
            transact.AddToBackStack("SiteSelect");
            transact.Commit();
        }
    }
}