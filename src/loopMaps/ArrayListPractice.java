package loopMaps;

import java.util.ArrayList;

// The base for the code comes from Varun when we did the in-class exercises! I made some small changes for my own reference.

import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        List<Integer> intArray = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter your number here:");
            intArray.add(Integer.parseInt(scanner.nextLine()));
        }
        
        int sum = 0;
        int product = 1;
        int largest = intArray.get(0);
        int smallest = intArray.get(0);

        for (Integer number: intArray) {
            sum += number;
            product *= number;

            if (number > largest) {
                largest = number;
            }
            
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println(intArray.toString());
        System.out.println("Sum of numbers in the array is: " + sum);
        System.out.println("Product of numbers in the array is: " + product);
        System.out.println("Largest of numbers in the array is: " + largest);
        System.out.println("Smallest of numbers in the array is: " + smallest);
        scanner.close();
    }
}
