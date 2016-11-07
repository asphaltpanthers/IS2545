using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Barnyard.WithDependencyInjection
{
    public class Barnyard
    {
        /*This is an example of an application with dependency injection. In this class, we inject the dependencies as parameters in the Barnyard
         * constructor. Now when we test this class, instead of testing with real animals, we can test with fake animals. Imagine if instead of
         * animals, the objects were things like database connections or API interfaces. We could design a fake database connection that returns
         * default values for our tests. We've now isolated our test to only test the method under test and there is no way for the test to fail
         * except for a bug in the method under test. See Barnyard.WithDependencyInjection.Tests for examples on how to mock
         * objects.
         */
        private Cow _cow;
        private Pig _pig;
        private Rooster _rooster;

        public Barnyard(Cow cow, Pig pig, Rooster rooster)
        {
            _cow = cow;
            _pig = pig;
            _rooster = rooster;
        }

        public string MakeNoise()
        {
            return _cow.Moo() + Environment.NewLine +
                _pig.Oink() + Environment.NewLine +
                _rooster.Crow();
        }
    }
}
