package com.tts;

import java.util.Arrays;
import static java.lang.Double.valueOf;

public class Math2 {
    public static void main(String[] args) {
        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);
        System.out.print("Your result is: "+ Arrays.toString(result));
    }       public static double[] toPower(int size, int power){
        double[] result = new double[size];
        for(int i=0; i<size; i++){
            result[i] = java.lang.Math.pow(valueOf(i), valueOf(power));
        }
        return result;
    }
}