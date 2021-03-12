package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Choice choice = new Choice();
        Draw draw = new Draw();

        int characters = choice.characters();

        System.out.println("Should it contain large characters? Y/N");
        String containsUppercaseLetters = scanner.nextLine();
        boolean up = choice.choice(containsUppercaseLetters);

        System.out.println("Should it contain numbers? Y/N");
        String containsNumbers = scanner.nextLine();
        boolean numbers = choice.choice(containsNumbers);

        System.out.println("Should it contain special characters? Y/N");
        String containsCharacters = scanner.nextLine();
        boolean chars = choice.choice(containsCharacters);

        draw.drawingCharacters(characters,up,numbers,chars);

    }
}
