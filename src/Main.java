import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        //WEIGHT CONVERSION PROGRAM

        //Declare variables

        double weight;
        double newWeight;
        int choice;

        //Welcome message

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        //Prompt for user choice
        System.out.println("Choose an option: ");
        choice = scanner.nextInt();


        //option 1 convert lbs to kgs
        if(choice == 1) {
            System.out.println("Enter weight (lbs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f kg", newWeight);
        }

        //option 2 convert kgs to lbs
        else if(choice == 2) {
            System.out.println("Enter weight (kgs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f lbs" , newWeight);
        }

        else{
            System.out.println("You did not enter a valid option");

            scanner.close();
        }
    }
}
