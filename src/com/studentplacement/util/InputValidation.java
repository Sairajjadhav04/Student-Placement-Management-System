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
    public static String readName(Scanner scanner, String fieldName) {
        while (true) {
            try {
                System.out.print("Enter " + fieldName + ": ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException(fieldName + " cannot be empty.");
                }

                if (!input.matches("[a-zA-Z ]+")) {
                    throw new InvalidInputException(
                            fieldName + " must contain only letters and spaces."
                    );
                }

                return input;

            } catch (InvalidInputException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }
    }
    public static String readBranch(Scanner sc, String fieldName) {
        while (true) {
            try {
                System.out.print(fieldName);
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException(
                            "Branch cannot be empty.");
                }

                if (!input.matches("[a-zA-Z &]+")) {
                    throw new InvalidInputException(
                            "Branch must contain only letters, spaces and &.");
                }

                return input;

            } catch (InvalidInputException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }
    }
    public static String readCompanyName(Scanner sc, String fieldName) {
        while (true) {
            try {
                System.out.print(fieldName);
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException(
                            "Company Name cannot be empty.");
                }

                if (!input.matches("[a-zA-Z0-9 &.-]+")) {
                    throw new InvalidInputException(
                            "Company Name contains invalid characters.");
                }

                return input;

            } catch (InvalidInputException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }
    }
    public static String readLocation(Scanner sc, String fieldName) {
        while (true) {
            try {
                System.out.print(fieldName);
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException(
                            "Location cannot be empty.");
                }

                if (!input.matches("[a-zA-Z0-9 ,.-]+")) {
                    throw new InvalidInputException(
                            "Location contains invalid characters.");
                }

                return input;

            } catch (InvalidInputException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }
    }
    public static String readJobRole(Scanner sc, String fieldName) {
        while (true) {
            try {
                System.out.print(fieldName);
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException(
                            "Job Role cannot be empty.");
                }

                if (!input.matches("[a-zA-Z0-9 &/.-]+")) {
                    throw new InvalidInputException(
                            "Job Role contains invalid characters.");
                }

                return input;

            } catch (InvalidInputException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }
    }
    public static String readPlacementStatus(Scanner sc, String fieldName) {
        while (true) {
            try {
                System.out.print(fieldName);
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException(
                            "Placement Status cannot be empty.");
                }

                if (!input.matches("[a-zA-Z ]+")) {
                    throw new InvalidInputException(
                            "Placement Status must contain only letters and spaces.");
                }

                return input;

            } catch (InvalidInputException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }
    }
    public static String readPlacementDate(Scanner sc, String fieldName) {
        while (true) {
            try {
                System.out.print(fieldName);
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    throw new InvalidInputException(
                            "Placement Date cannot be empty.");
                }

                if (!input.matches("\\d{2}-\\d{2}-\\d{4}")) {
                    throw new InvalidInputException(
                            "Placement Date must be in DD-MM-YYYY format.");
                }

                return input;

            } catch (InvalidInputException e) {
                System.out.println("Invalid Input: " + e.getMessage());
            }
        }
    }
}