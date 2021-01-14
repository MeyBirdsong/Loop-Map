package com.tts;


import java.util.*;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

        int i;
        int number = 0;
        int sum = 0;


        System.out.println("Please enter 5 numbers");
                for( i=0; i<6; i++);
                    Scanner input = new Scanner(System.in);
                     number = input.nextInt();
                     sum += number;

        double exampleArray[] = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int l = 1; l < exampleArray.length; l++){

            if (exampleArray[ l ] > maximum) {

                maximum = exampleArray[ l ];

                index = l;

            }

        }
        System.out.println("index");

            }
/*
    public static double pow(Double i, Double power) {
        if (power == 0) i = 1.0;
        while (power > 1) {
            i = i * i;
        }
        return i;
    }*/
}
