using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Configuration;

namespace NGForms.Server.Configuration
{
    public class ServerConfigurationSection : ConfigurationSection
    {
        [ConfigurationProperty("portNumber", IsRequired = false)]
        public int PortNumber
        {
            get { return (int)this["portNumber"]; }
            set { this["portNumber"] = value; }
        }
    }
}
