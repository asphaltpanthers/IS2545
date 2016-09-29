/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaryardWithDependencyInjection;

/**
 *
 * @author AsphaltPanthers
 */
public class Barnyard {
    private final Cow _cow;
    private final Pig _pig;
    private final Rooster _rooster;
    
    public Barnyard(Cow cow, Pig pig, Rooster rooster) {
        _cow = cow;
        _pig = pig;
        _rooster = rooster;
    }
    
    public void makeNoise() {
        _cow.moo();
        _pig.oink();
        _rooster.crow();
    }
}
