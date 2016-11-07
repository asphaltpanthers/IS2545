using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Moq;
using Xunit;

namespace Barnyard.WithDependencyInjectionAndPolymorphism.Tests
{
    public class WhenTheBarnyardMakesNoiseWithMoq
    {
        private string _noise;

        public WhenTheBarnyardMakesNoiseWithMoq()
        {
            var mockAnimal = new Mock<IAnimal>();
            mockAnimal.Setup(a => a.Vocalize())
                .Returns("TestVocalize");

            var barnyard = new Barnyard(new List<IAnimal>() { mockAnimal.Object });

            _noise = barnyard.MakeNoise();
        }

        [Fact]
        public void ThenNoiseIsMade()
        {
            Assert.Equal("TestVocalize" + Environment.NewLine, _noise);
        }
    }
}
