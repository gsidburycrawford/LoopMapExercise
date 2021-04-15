package com.company;
import java.util.*;
/*
TODO: You are a car dealer. Create a hash map of vehicles.
    The model is the Key, the make is the Value.
    Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
    (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")

 */
public class CarDealer {

    public static void getCars() {

        //Declare and initialize a new HashMap for our cars
        HashMap<String, String> cars = new HashMap<>();


        //Put in Model (Key) and it's Model (Value)
        cars.put("Camry", "Toyota" );
        cars.put("CX-5", "Mazda");
        cars.put("Equinox", "Chevrolet");
        cars.put("Sonata", "Hyundai");
        cars.put("Accord", "Honda");

        //Create a new scanner
        Scanner scanner = new Scanner(System.in);

        //Output a welcome message to the user, and prompt for input
        System.out.println("Welcome to Wyatt I. Newman's Auto Parts! What kind of car are you looking for today? ");

        //Assign input value to a String variable
        String userModel = scanner.nextLine();

        //If the HashMap contains the user's model as a key, then we print a message showing
        // that we have it in stock. Otherwise, tell them that we couldn't find the requested model. 
        if (cars.containsKey(userModel)) {
            System.out.println("Oh, you're looking for a " + userModel +"? Our " + cars.get(userModel) + " selection is right over here...");
        } else {
            System.out.println("Sorry, but we couldn't find the model you were looking for.");
        }

    }
}
