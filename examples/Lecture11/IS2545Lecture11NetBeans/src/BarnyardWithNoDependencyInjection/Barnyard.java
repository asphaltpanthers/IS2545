/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarnyardWithNoDependencyInjection;

/**
 *
 * @author AsphaltPanthers
 */
public class Barnyard {
    private final Cow _cow = new Cow();
    private final Pig _pig = new Pig();
    private final Rooster _rooster = new Rooster();
    
    public void makeNoise() {
        _cow.moo();
        _pig.oink();
        _rooster.crow();
    }
}
