using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace FAMSXpress
{
    public class Site
    {
        public int siteId;
        public int companyId;
        public string siteName;
        public string latitude;
        public string longitude;

        public Site(int siteId, int compId, string siteName, string latitude, string longitude)
        {
            this.siteId = siteId;
            this.companyId = compId;
            this.siteName = siteName;
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }
}