using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Barnyard.NoDependencyInjection
{
    public class Barnyard
    {
        /*This is an example of an application with no dependency injection. What if instead of a barnyard, this was a modern software application, and instead of
         * animals, the objects were things like database connections or API interfaces? There would be no way to test the MakeNoise() method without executing the
         * database or API interface code as well. This introduces a problem. If we are executing the database code and a test fails, it may have failed because
         * there was a bug in the database code or it may have failed because of unexpected data in the database. We only want our tests to fail if there is a bug in
         * the logic of the method under test.
         */
        private Cow _cow = new Cow();
        private Pig _pig = new Pig();
        private Rooster _rooster = new Rooster();

        public string MakeNoise()
        {
            return _cow.Moo() + Environment.NewLine +
                _pig.Oink() + Environment.NewLine + 
                _rooster.Crow();
        }
    }
}
