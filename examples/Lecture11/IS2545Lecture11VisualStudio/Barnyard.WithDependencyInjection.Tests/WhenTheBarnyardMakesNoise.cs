using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Barnyard.WithDependencyInjection.Fakes;
using Microsoft.QualityTools.Testing.Fakes;
using Xunit;

namespace Barnyard.WithDependencyInjection.Tests
{
    public class WhenTheBarnyardMakesNoise
    {
        private string _noise;

        public WhenTheBarnyardMakesNoise()
        {
            using (ShimsContext.Create())
            {
                ShimCow.AllInstances.Moo = c => "TestMoo";
                ShimPig.AllInstances.Oink = p => "TestOink";
                ShimRooster.AllInstances.Crow = r => "TestCrow";

                var barnyard = new Barnyard(new Cow(), new Pig(), new Rooster());

                _noise = barnyard.MakeNoise();
            }
        }

        [Fact]
        public void ThenTheNoiseIsMade()
        {
            Assert.Equal("TestMoo" + Environment.NewLine +
                "TestOink" + Environment.NewLine + 
                "TestCrow", _noise);
        }
    }
}
