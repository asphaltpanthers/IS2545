using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Barnyard.WithDependencyInjectionAndPolymorphism.Fakes;
using Xunit;

namespace Barnyard.WithDependencyInjectionAndPolymorphism.Tests
{
    public class WhenTheBarnyardMakesNoiseWithStubs
    {
        private string _noise;

        public WhenTheBarnyardMakesNoiseWithStubs()
        {
            var mockAnimal = new StubIAnimal()
            {
                Vocalize = () => "TestVocalize"
            };

            var barnyard = new Barnyard(new List<IAnimal>() { mockAnimal });

            _noise = barnyard.MakeNoise();
        }

        [Fact]
        public void ThenNoiseIsMade()
        {
            Assert.Equal("TestVocalize" + Environment.NewLine, _noise);
        }
    }
}
