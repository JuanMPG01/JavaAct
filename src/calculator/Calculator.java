package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AppCalculator calc = new AppCalculator();
        boolean exit = false;

        System.out.println("Welcome to the Calculator!");

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power (base^exponent)");
            System.out.println("6. Show last result");
            System.out.println("0. Exit");

            System.out.print("Option: ");
            int option = scanner.nextInt();

            double a, b;
            int exponent;

            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter the first number: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        b = scanner.nextDouble();
                        System.out.println("Result: " + calc.add(a, b));
                        break;
                    case 2:
                        System.out.print("Enter the first number: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        b = scanner.nextDouble();
                        System.out.println("Result: " + calc.subtract(a, b));
                        break;
                    case 3:
                        System.out.print("Enter the first number: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        b = scanner.nextDouble();
                        System.out.println("Result: " + calc.multiply(a, b));
                        break;
                    case 4:
                        System.out.print("Enter the dividend: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter the divisor: ");
                        b = scanner.nextDouble();
                        System.out.println("Result: " + calc.divide(a, b));
                        break;
                    case 5:
                        System.out.print("Enter the base: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter the exponent (integer): ");
                        exponent = scanner.nextInt();
                        System.out.println("Result: " + calc.power(a, exponent));
                        break;
                    case 6:
                        System.out.println("Last result: " + calc.getLastResult());
                        break;
                    case 0:
                        exit = true;
                        System.out.println("Exiting the calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}





