using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Barnyard.WithDependencyInjectionAndPolymorphism
{
    public class Rooster : IAnimal
    {
        public string Vocalize()
        {
            return "Crow!";
        }
    }
}
