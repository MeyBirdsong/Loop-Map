package com.tts;

import java.util.*;
import java.util.List;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        //first attempt involved lots of hard coding and did not include ArrayList
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numberArray = new ArrayList<>(5);
        System.out.println("Hi, please enter 5 numbers with a space between and then press enter.");
        while (input.hasNextInt()) {
            numberArray.add(input.nextInt());
            if (numberArray.size()== 5)break;
        }
        System.out.println("Now we'll find the sum, product, and identify the smallest and largest number" + numberArray);
        int sum = 0;
        for (Integer integer : numberArray) {
            sum += integer;
        }
        int prod = 1;
        for (Integer integer : numberArray) {prod *= integer;}
        System.out.println(" The sum of your numbers = " + sum);
        System.out.println(" The product of your numbers = " + prod);
        Collections.sort(numberArray);
        System.out.println("Your smallest number is: " + numberArray.get(0));
        System.out.println("Your largest number is: " + numberArray.get(4));

    }
}





