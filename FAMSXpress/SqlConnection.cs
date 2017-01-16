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
using System.Net;
using System.IO;
using System.Data;

namespace FAMSXpress
{
	class SqlConnection
	{
		public DataSet getSqlInfo(string query, string param)
		{
			try {
                //var request = HttpWebRequest.Create(string.Format(@"http://154.0.162.20/ScheduleProcessorService/Service1.asmx/ExecuteSP?sp=" + query + "&authKey=CSD123456"));
                var request = HttpWebRequest.Create(string.Format(@"http://csdtecmo.biz/FAMSXpressService/Service.asmx/ExecSP?sp=" + query + "&param=" + param + "&Auth=CSD123456"));
                request.ContentType = "application/soap";
				request.Method = "GET";

				using (HttpWebResponse response = request.GetResponse() as HttpWebResponse)
				{
					if (response.StatusCode != HttpStatusCode.OK)
						Console.Out.WriteLine("Error fetching data. Server returned status code: {0}", response.StatusCode);
					using (StreamReader reader = new StreamReader(response.GetResponseStream()))
					{
						DataSet x = new DataSet();
						x.ReadXml(reader);

						return x;
					}
				}

			} 
			catch (Exception ex) 
			{
				string exx = ex.ToString(); 
				return null;

			}
		}
	}
}

