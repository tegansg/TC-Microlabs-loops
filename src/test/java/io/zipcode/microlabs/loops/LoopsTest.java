package io.zipcode.microlabs.loops;


import org.junit.Assert;
import org.junit.Test;

public class LoopsTest {

    @Test
    public void printArrayTest(){
        // :Given
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";
        //:when
        String actual =Loops.printArray(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
    }
}
