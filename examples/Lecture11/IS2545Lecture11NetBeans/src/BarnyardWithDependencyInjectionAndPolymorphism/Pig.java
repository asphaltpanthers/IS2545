/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarnyardWithDependencyInjectionAndPolymorphism;
/**
 *
 * @author AsphaltPanthers
 */
public class Pig implements IAnimal {
    @Override
    public void vocalize() {
        System.out.println("Oink!");
    }
}
