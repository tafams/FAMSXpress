using Android.App;
using Android.Widget;
using Android.OS;

namespace FAMSXpress
{
    [Activity(Label = "FAMSXpress", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : Activity
    {
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);

            // Set our view from the "main" layout resource
            SetContentView (Resource.Layout.Main);

            FragmentLogin login = new FragmentLogin();
            FragmentTransaction trans = FragmentManager.BeginTransaction();
            trans.Add(Resource.Id.frameLayout1, login,"Login");
            trans.Commit();            
        }
    }
}

