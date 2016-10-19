/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author AsphaltPanthers
 */
public class SortTest {
    public ArrayList<BiFunction<int[], int[], Boolean>> properties = new ArrayList<>();
    public int[] toBeSorted = new int[100];
    public Random generator = new Random();
    
    @Before
    public void Setup() {
        //Output array same size as input array.
        properties.add((input, output) -> input.length == output.length);
        
        //Values in output array always increasing or staying the same.
        properties.add((input, output) -> {
            int current = output[0];
            for (int i = 1; i < output.length; i++) {
                if (current > output[i]) {
                    return false;
                }
                current = output[i];
            }
            return true;
        });
        
        //Every element in input array is in output array.
        properties.add((input, output) -> {
            for (int i = 0; i < input.length; i++) {
                boolean found = false;
                for (int j = 0; j < output.length; j++) {
                    if (input[i] == output[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return false;
                }
            }
            return true;
        });
        
        //Every element in output array is in input array.
        properties.add((input, output) -> {
            for (int i = 0; i < output.length; i++) {
                boolean found = false;
                for (int j = 0; j < input.length; j++) {
                    if (output[i] == input[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return false;
                }
            }
            return true;
        });
        
        //Indempotent
        properties.add((input, output) -> Arrays.equals(output, Sort.ascending(output)));
        
        //Pure
        properties.add((input, output) -> Arrays.equals(Sort.ascending(input), Sort.ascending((input))));
    }
    
    @Test
    public void PropertyBasedTest() {
        for (int i = 1; i <= 100; i++) {
            //Generate input
            for (int j = 0; j < 100; j++) {
                toBeSorted[j] = generator.nextInt(1000000 + 1 + 1000000) - 1000000;
            }
            int[] sorted = Sort.ascending(toBeSorted);
            properties.stream().forEach((property) -> {
                assertTrue((boolean)property.apply(toBeSorted, sorted));
            });
        }
    }
}
