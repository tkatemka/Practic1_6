package com.mycompany.practical3;

import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select variant of child class: ");
        int choice = scanner.nextInt();

        Doctor doctor;
        if (choice == 1) {
            doctor = new Doctor1();
        } else if (choice == 2) {
            doctor = new Doctor2();
        } else {
            System.out.println("Incorrect choice");
            doctor = new Doctor();
        }

        System.out.println("Enter text of recipe: ");
        scanner.nextLine();
        String recipeText = scanner.nextLine();

        doctor.writeRecipe(recipeText);

        scanner.close();
    }
}
