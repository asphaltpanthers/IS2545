/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarnyardWithDependencyInjectionAndPolymorphism;

import java.util.ArrayList;

/**
 *
 * @author AsphaltPanthers
 */
public class Barnyard {
    private final ArrayList<IAnimal> _animals;
    
    public Barnyard(Cow cow, Pig pig, Rooster rooster) {
        _animals = new ArrayList<>();
        _animals.add(cow);
        _animals.add(pig);
        _animals.add(rooster);
    }
    
    public void makeNoise() {
        _animals.forEach(a -> a.vocalize());
    }
}
