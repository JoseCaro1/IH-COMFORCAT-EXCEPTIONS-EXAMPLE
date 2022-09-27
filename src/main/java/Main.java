package main.java;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(concat(getName(),getName()));
    }

    public static String readAndValidateName() throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        if (result.isBlank()) throw new IllegalArgumentException("No has introducido una cadena valida");

        return result;
    }

    public static String getName() {
        boolean isCorrect = true;
        String name = null;
        System.out.println("Introduce un nombre");
        while (isCorrect) {
            try {
                name = readAndValidateName();
                isCorrect = false;
            } catch (IllegalArgumentException e) {
                System.err.println("No has introducido correctamente el nombre, vuelvelo a introducir");
            }
        }
        return name;
    }

    public static String concat(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
