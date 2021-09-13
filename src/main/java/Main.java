import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            if (getInput(scan, "Is the car silent when you turn the key? ")) {
                if (getInput(scan, "Are the battery terminal corroded? ")) {
                    System.out.println("Clean the terminals and try starting again.");
                    return;
                }
                System.out.println("Replace cables and try again.");
                return;
            } else {
                if (getInput(scan, "Does the car make a slicking noise? ")) {
                    System.out.println("Replace the battery");
                    return;
                }
                if (getInput(scan, "Does the scar crank up but fail to start? ")) {
                    System.out.println("Check spark plug connections.");
                    return;
                }
                if (getInput(scan, "Does the engine start and then die? ")) {
                    if (getInput(scan, "Does your car have fuel injection? ")) {
                        System.out.println("Get it in for service.");
                        return;
                    }
                    System.out.println("Check to ensure the choke is opening and closing.");
                    return;
                }
            }
        }
        System.out.println("This should not be possible.");
    }

    /**
     * Returns true or false based on the users input
     * @param scan scanner
     * @param message question to ask the user.
     * @return lowercase and trimmed input.
     */
    public static boolean getInput(Scanner scan, String message) {
        System.out.print(message);
        return scan.next().toLowerCase().trim().equals("y");
    }
}
