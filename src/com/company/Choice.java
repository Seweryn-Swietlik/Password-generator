package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Choice {
    Scanner scanner = new Scanner(System.in);

    //entering the number of characters.

    public int characters() {
        try {
            System.out.println("Enter how many characters the password should have: ");
            int chars = scanner.nextInt();
            scanner.nextLine();
            return chars;
        } catch (InputMismatchException ex) {
            System.out.println("Bad characters! Try again!");
            scanner.nextLine();
            return characters();
        }

    }

    //User selection.

    public boolean choice(String includes) {

        if (includes.equals("Y") || includes.equals("y")) {
            return true;
        } else if (includes.equals("N") || includes.equals("n")) {
            return false;
        } else {
            System.out.println("Bad characters! Try again!!");
            String includess = scanner.nextLine();
            return choice(includess);
        }
    }
}
