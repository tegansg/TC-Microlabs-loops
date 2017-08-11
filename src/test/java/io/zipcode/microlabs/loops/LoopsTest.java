package io.zipcode.microlabs.loops;


import org.junit.Assert;
import org.junit.Test;

public class LoopsTest {

    @Test
    public void printArrayTest()
    {
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
    
    @Test
    public void lastElementTest()
    {
    	
        // :Given
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nMushrooms";
       
    	
        //:when
        String actual =Loops.lastElement(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
 
    }
    

    @Test
    public void lastButOneTest()
    {
        // :Given
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nTomatoes";
    	
        //:when
        String actual =Loops.lastButOne(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);	
    	
    	
 
    }
    
    
    
    @Test
    public void reverseTest()
    {
    	
        // :Given
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nMushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage";
    	
        //:when
        String actual =Loops.reverse(breakfast);

        //:Then
        Assert.assertEquals(expected, actual);
    	
 
    }
    
    @Test
    public void isPalindromeTrueTest()
    {
    	
        // :Given
    	String [] palindromic = {"Sausage", "Eggs", "Beans",
    			"Beans", "Eggs", "Sausage"};
    	
    	
    	Boolean expectedTrue = true;

        //:when
    	
    	Boolean actualTrue = Loops.isPalindrome(palindromic);
        
    	//:Then
        Assert.assertEquals(expectedTrue, actualTrue);

    	
 
    }
    
    @Test
    public void isPalindromeFalseTest()
    {
    	
        // :Given    	
    	String [] breakfast = {"Sausage", "Eggs", "Beans",
    			"Bacon", "Tomatoes", "Mushrooms"};
    	
    	Boolean expectedFalse = false;
        //:when
    	
    	Boolean actualFalse = Loops.isPalindrome(breakfast);
        
    	//:Then
        Assert.assertEquals(expectedFalse, actualFalse);
    	
 
    }
    
    @Test
    public void compressTest()
    {
    	
        // :Given
    	int[] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
    	String expected = "1\n3\n2\n1\n4";
       

        //:When
    	String actual = Loops.compress(nums);
    	
    	//:Then
        Assert.assertEquals(expected, actual);
    	
 
    }
    
    
    @Test
    public void packTest()
    {
    	
        // :Given
    	 char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
    	 String expected = "aaaa, b, cc, aa, d, eeee";
    	 
        //:when
    	 String actual = Loops.pack(letters);

        //:Then
         Assert.assertEquals(expected, actual);
   
 
    }
    
}
