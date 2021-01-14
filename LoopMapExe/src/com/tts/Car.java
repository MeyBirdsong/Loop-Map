package com.tts;

import java.util.*;
import java.util.HashMap;


public class Car {

    public static void main(){

        Scanner input = new Scanner(System.in);
        System.out.println("What car(model) are you looking for");

        String carModel = input.nextLine();

        //Create an empty Hashmap
        HashMap<String,String>car = new HashMap<>();

        //Add cars to our inventory
        car.put("Civic","Honda");
        car.put("Cruise","Chevrolet");
        car.put("Corolla","Toyota");
        car.put("F150","Ford");

        //Filter out cars
        if(car.containsKey(carModel)){
            System.out.println("Our Honda selection is right over here");
        }else {
            System.out.println("Unfortunately we don't have that model");
        }



    }

    }

