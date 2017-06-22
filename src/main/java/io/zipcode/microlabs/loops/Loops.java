package io.zipcode.microlabs.loops;


public class Loops {

    public static String printArray(String[] input){
        String response = "*** Output ***";
        for(int x=0; x< input.length; x++){
            response +="\n" + input[x];
        }
        return response;
    }

}
