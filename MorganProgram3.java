package csci2010.morganprogram3;

import java.util.Scanner;

/**
 *CSCI 2010 Programming Assignment 3
 * @author Jon-Michael Morgan
 * This program will simulate a Hanoi tower using the amount of discs the user specifies
 */
public class MorganProgram3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int discs;
        boolean keepGoing = true;
        System.out.println("Welcome to Jon-Michael Morgan's Hanoi tower simulation!");
        System.out.println("");
        
        while (keepGoing)
        {
            System.out.println("How many discs do you wish to simulate?");
            discs = keyboard.nextInt();
            HanoiSimulation hanoi = new HanoiSimulation(discs);
            hanoi.runSim();
            System.out.println("");
            System.out.println("Would you like to run another simulation?");
            String ans = keyboard.next();
            if (ans.equalsIgnoreCase("y"))
                keepGoing = true;
            else if (ans.equalsIgnoreCase("n"))
                break;
            else
            {
                System.out.println("Invalid choice.");
                System.exit(0);
            }
        }
        System.out.println("");
        System.out.println("Thank you for using Jon-Michael Morgan's Hanoi tower simulation.");
        
    }
}
