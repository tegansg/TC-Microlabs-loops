package io.zipcode.microlabs.loops;

public class Loops 
{

    public static String printArray(String[] input)
    {
        String response = "*** Output ***";
        for(int x=0; x< input.length; x++)
        {
            response +="\n" + input[x];
        }
        return response;
    }
  
    
    // 2 Last Element of Array
    public static String lastElement(String[] input)
    {
    	int length = input.length;
    	String output = "*** Output ***\n" +
    					input[length-1]; // length - 1 is the index of the last element
    	return output;
    }
    

    // 3 Last but One Element of Array
    public static String lastButOne(String[] input)
    {
    	int length = input.length;
    	String output = "*** Output ***\n"
    			+ input[length-2]; // length - 2 is the index of the last but one element
    	return output;
    }
    
    
    
    // 4 Reverse and Array
    public static String reverse(String[] input)
    {
        String response = "*** Output ***";
        int length = input.length;
        
        for(int x=1; x<=length; x++)
        {
        	String ex = input[length-x];
            response +="\n"+ex;
        }
        return response;
    }
   
    // 5 is Palindrome

    public static Boolean isPalindrome(String[] input)
    {
    	int length = input.length;
    	for(int x=0; x<=length/2-1; x++)
    	{
    		if(input[x] != input[length - x - 1])
    		{
    			return false;
    		}
    	}
    	return true;
    }
    
    // 6 Consecutive Duplicates
    public static String compress(int[] input)
    {
    	int length = input.length;
    	String response = "";
    	
    	response += input[0]; // add first element from input into response

    	for(int x=1; x<length; x++)
    	{
    		int before = x - 1;
    		if(input[before] != input[x])
    		{
    			response += "\n" + input[x];
    		}
    	}
    	return response;
    }
    
    
    
    // 7 Pack Duplicates
    public static String pack(char[] input)
    {
    	int length = input.length;
    	String response = "";
    
    	for(int x=0; x<length-1; x++)
    	{
    		response += input[x];
    		
    		if (input[x] != input[x+1]) 
    		{
    			response += ", ";
    		}		
    	}			
    	
    	response += input[length-1]; // add last element from input into response
    	
    	return response;   	
    }
    
}
