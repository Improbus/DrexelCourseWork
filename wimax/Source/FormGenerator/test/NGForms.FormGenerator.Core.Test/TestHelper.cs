using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace NGForms.FormGenerator.Core.Test
{
    public static class TestHeleper
    {
        static TestHeleper()
        {
            TestDirectory = "..\\testdata";
        }

        /// <summary>
        /// This assumes that the test's working directory is the default bin directory
        /// </summary>
        public static string TestDirectory { get; set; }

        public static string GetFormPath(string form)
        {
            return Path.Combine(TestDirectory, form);
        }
    }
}
