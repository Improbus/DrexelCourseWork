using System;
using System.Configuration;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading;
using NGForms.Server.Configuration;

namespace NGForms.Server
{
    /// <summary>
    /// This is a simple demo application that shows how one could build a Server application that listens to a port
    /// and reads the NgForm xml string. This application does NOT handle the business logic that is involved in
    /// integrating NgFroms Server with policy of the organization.
    /// </summary>
    internal sealed class Program
    {
        internal static void Main(string[] args)
        {
            PrintBanner();

            ServerConfigurationSection config = (ServerConfigurationSection)ConfigurationManager.GetSection("ngforms/server");

            TcpListener socket = new TcpListener(IPAddress.Any, config.PortNumber);
            socket.Start();

            // Listen forever
            while (true)
            {
                TcpClient client = socket.AcceptTcpClient();
                Thread thread = new Thread(HandleTcpClient);
                thread.Start(client);
            }
        }

        private static void HandleTcpClient(object state)
        {
            TcpClient client = (TcpClient)state;
            NetworkStream stream = client.GetStream();
            Byte[] data = new Byte[1];
            string responseData = string.Empty;
            do
            {
                Int32 bytes = stream.Read(data, 0, data.Length);
                responseData += Encoding.ASCII.GetString(data, 0, bytes);
            }
            while (stream.DataAvailable);

            PrintToConsole(responseData);
        }

        private static void PrintBanner()
        {
            lock (typeof(Console))
            {
                Console.WriteLine("====================================================");
                Console.WriteLine(" NgForms Server");
                Console.WriteLine("====================================================");
                Console.WriteLine();
            }
        }

        private static void PrintToConsole(string str)
        {
            lock (typeof(Console))
            {
                Console.WriteLine("====================================================");
                Console.WriteLine();
                Console.WriteLine("Time: " + DateTime.Now);
                Console.WriteLine();
                Console.WriteLine(str);
                Console.WriteLine();
                Console.WriteLine("====================================================");
                Console.WriteLine();


                //// You can get a reference to the NgForm object like this
                //NGForms.Core.NgForm form = NGForms.Core.Validators.Util.XmlHelper.Deserialize(str);

                //// With the NgForm reference, you can format the input as you like.
                //// The following suchs a simple text format
                //Console.WriteLine("Form Name: " + form.Name);
                //Console.WriteLine("====================================================");
                //Console.WriteLine();
                //foreach (NGForms.Core.NgFormSection section in form.Sections)
                //{
                //    Console.WriteLine("Section: " + section.Title);
                //    Console.WriteLine("====================================================");
                //    foreach (NGForms.Core.Fields.INgField field in section.Fields)
                //    {
                //        Console.WriteLine(field.Label + ": " + field.Value);
                //    }
                //    Console.WriteLine();
                //}
            }
        }
    }
}
