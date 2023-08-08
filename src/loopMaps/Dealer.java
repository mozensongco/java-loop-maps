package loopMaps;

import java.util.HashMap;
import java.util.Scanner;

//The base for the code comes from Varun when we did the in-class exercises! I made some small changes for my own reference.

public class Dealer {

    public static HashMap<String,String> vehicles = new HashMap<>();

    public static void main(String[] args) {

        vehicles.put("Civic", "Honda");
        vehicles.put("Rogue", "Nissan");
        vehicles.put("Camry", "Toyota");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the make of the vehicle you are interested in:");

        String input = scanner.nextLine();

        if(vehicles.containsKey(input)) {
            System.out.println("Oh, you're looking for a " + input + "? Our " + vehicles.get(input) + " selection is right over here...");
        }
        else {
            System.out.println("Sorry we don't have " + input + " in stock..");
        }

        scanner.close();
    }
}
