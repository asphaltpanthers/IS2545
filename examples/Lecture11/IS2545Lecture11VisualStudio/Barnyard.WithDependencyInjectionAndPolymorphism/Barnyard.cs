using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Barnyard.WithDependencyInjectionAndPolymorphism
{
    public class Barnyard
    {
        /*This is an example of an application with dependency injection and polymorphism. We still are injecting the dependencies as parameters,
         * but the parameter is a list of an abstract data type named IAnimal. IAnimal is an interface with one method that need overriding,
         * Vocalize(). This is an improvement for two reasons:
         * 
         * 1. Testability
         * 
         * Now when we create mocks (as seen in Barnyard.WithDependencyInjectionAndPolymorphism.Tests) we only need to create a mock for one data
         * type instead of three.
         * 
         * 2. Extensibility
         * 
         * With this implementation it becomes much easier to add animals to the barnyard. In fact, we can do it without making any changes to
         * this code. This code can support barnyards made up of any number or types of animals. This results in less code overhead and simpler,
         * easier to understand solutions that are better tested.
         */
        private IEnumerable<IAnimal> _animals;

        public Barnyard(IEnumerable<IAnimal> animals)
        {
            _animals = animals;
        }

        public string MakeNoise()
        {
            var noise = "";
            foreach (var animal in _animals)
            {
                noise += animal.Vocalize() + Environment.NewLine;
            }
            return noise;
        }
    }
}
