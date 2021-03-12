package com.company;


import java.util.*;

public class Draw {
    private final static String LOW = "abcdefghijklmnopqrstuvwxyz";
    private final static String UP = LOW.toUpperCase(Locale.ROOT);
    private final static String CH = "!@#$%^&*()_+";
    private String password = "";

    Random random = new Random();

    //Randomization of characters from the user's choice.

    private char choice(String choice) {
        int b = random.nextInt(choice.length());
        return choice.charAt(b);
    }

    //Adjustment to the user's choice

    private char draw(boolean up, boolean numbers, boolean characters) {
        if (up && !numbers && !characters) {
            return choice("bc");
        } else if (!up && numbers && !characters) {
            return choice("ab");
        } else if (!up && !numbers && characters) {
            return choice("bd");
        } else if (up && numbers && !characters) {
            return choice("abc");
        } else if (up && !numbers && characters) {
            return choice("bcd");
        } else if (!up && numbers && characters) {
            return choice("abd");
        } else if (up && numbers && characters) {
            return choice("abcd");
        } else {
            return choice("b");
        }
    }

    //Password draw for the choices made.

    public void drawingCharacters(int chose, boolean up, boolean numbers, boolean characters) {
        for (int i = 0; i < chose; i++) {
            char rand = draw(up, numbers, characters);

            switch (rand) {
                case ('a') -> password += String.valueOf(random.nextInt(10));
                case ('b') -> { int a = random.nextInt(LOW.length());
                    password += String.valueOf(LOW.charAt(a));
                }
                case ('c') -> { int a = random.nextInt(UP.length());
                    password += String.valueOf(UP.charAt(a));
                }
                case ('d') -> { int a = random.nextInt(CH.length());
                    password += String.valueOf(CH.charAt(a));
                }
            }
        }System.out.println(password);
    }
}


