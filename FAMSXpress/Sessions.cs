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
    class Sessions
    {
        private static int userId = 0;
        private static int siteId = 0;
        private static int roleId = 0;
        private static List<Site>sites;

        public static void SetUserId(int uId)
        {
            userId = uId;
        }

        public static int GetUserId()
        {
            if (userId != 0)
            {
                return userId;
            }
            else {
                return 0;
            }
        }

        public static void SetSiteId(int sId)
        {
            siteId = sId;
        }

        public static int GetSiteId()
        {
            if (siteId != 0)
            {
                return siteId;
            }
            else
            {
                return 0;
            }
        }

        public static void SetRoleId(int rId)
        {
            roleId = rId;
        }

        public static int GetRoleId()
        {
            if (roleId != 0)
            {
                return roleId;
            }
            else
            {
                return 0;
            }
        }

        public static void SetSites(List<Site>siteList)
        {
            sites = siteList;
        }

        public static List<Site> GetSites()
        {
            if (sites.Count != 0)
            {
                return sites;
            }
            else
            {
                return null;
            }
        }

    }
}