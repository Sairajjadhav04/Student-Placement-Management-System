package com.studentplacement.util;
import java.util.Scanner;
public class InputValidation {

    // Validate integer input
    public static int readInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine();

                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }
    // Validate double input
    public static double readDouble(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            if (sc.hasNextDouble()) {
                double value = sc.nextDouble();
                sc.nextLine();

                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Value cannot be negative.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }
    // Validate float input
    public static float readFloat(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            if (sc.hasNextFloat()) {
                float value = sc.nextFloat();
                sc.nextLine();

                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Value cannot be negative.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }
    // Validate String input values
    public static String readString(Scanner sc, String message) {
        while (true) {
            System.out.print(message);

            String value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            } else {
                System.out.println("Input cannot be empty.");
            }
        }
    }
    // Validate email
    public static String readEmail(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String email = sc.nextLine().trim();
            if (email.contains("@") && email.contains(".")) {
                return email;
            } else {
                System.out.println("Invalid email! Please enter a valid email.");
            }
        }
    }
    // Validate CGPA when input is taken
    public static double readCgpa(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextDouble()) {
                double cgpa = sc.nextDouble();
                sc.nextLine();
                if (cgpa >= 0 && cgpa <= 10) {
                    return cgpa;
                }
                else {
                    System.out.println("CGPA must be between 0 and 10.");
                }
            }
            else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }
}