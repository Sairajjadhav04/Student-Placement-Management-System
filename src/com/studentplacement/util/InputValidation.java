package com.studentplacement.util;
import java.util.Scanner;
public class InputValidation {
    // Validate integer input
    public static int readInt(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                if (!sc.hasNextInt()) {
                    sc.nextLine();
                    throw new InvalidInputException("Invalid input! Please enter a number.");
                }
                int value = sc.nextInt();
                sc.nextLine();
                if (value <= 0) {
                    throw new InvalidInputException("Please enter a positive number.");
                }
                return value;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // Validate double input
    public static double readDouble(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                if (!sc.hasNextDouble()) {
                    sc.nextLine();
                    throw new InvalidInputException("Invalid input! Please enter a number.");
                }
                double value = sc.nextDouble();
                sc.nextLine();
                if (value < 0) {
                    throw new InvalidInputException("Value cannot be negative.");
                }
                return value;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // Validate float input
    public static float readFloat(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                if (!sc.hasNextFloat()) {
                    sc.nextLine();
                    throw new InvalidInputException("Invalid input! Please enter a number.");
                }
                float value = sc.nextFloat();
                sc.nextLine();
                if (value < 0) {
                    throw new InvalidInputException("Value cannot be negative.");
                }
                return value;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // Validate String input
    public static String readString(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                String value = sc.nextLine().trim();
                if (value.isEmpty()) {
                    throw new InvalidInputException("Input cannot be empty.");
                }
                return value;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // Validate email
    public static String readEmail(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                String email = sc.nextLine().trim();
                if (email.isEmpty()) {
                    throw new InvalidInputException("Email cannot be empty.");
                }
                if (!email.contains("@") || !email.contains(".")) {
                    throw new InvalidInputException("Invalid email! Please enter a valid email.");
                }
                return email;

            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // Validate CGPA
    public static double readCgpa(Scanner sc, String message) {
        while (true) {
            try {
                System.out.print(message);
                if (!sc.hasNextDouble()) {
                    sc.nextLine();
                    throw new InvalidInputException("Invalid input! Please enter a number.");
                }
                double cgpa = sc.nextDouble();
                sc.nextLine();
                if (cgpa < 0 || cgpa > 10) {
                    throw new InvalidInputException("CGPA must be between 0 and 10.");
                }
                return cgpa;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}