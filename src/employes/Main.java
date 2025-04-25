package employes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeAges employeeAges = new EmployeeAges();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Employee Ages Manager!");
        System.out.println("Commands: add <age>, remove <age>, display, average, exit");

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            String[] parts = command.split(" ");
            switch (parts[0].toLowerCase()) {
                case "add":
                    if (parts.length == 2) {
                        try {
                            int age = Integer.parseInt(parts[1]);
                            employeeAges.addAge(age);
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number for age.");
                        }
                    } else {
                        System.out.println("Usage: add <age>");
                    }
                    break;

                case "remove":
                    if (parts.length == 2) {
                        try {
                            int age = Integer.parseInt(parts[1]);
                            employeeAges.removeAge(age);
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number for age.");
                        }
                    } else {
                        System.out.println("Usage: remove <age>");
                    }
                    break;

                case "display":
                    employeeAges.displayAges();
                    break;

                case "average":
                    double average = employeeAges.getAverageAge();
                    System.out.printf("Average Age: %.2f%n", average);
                    break;

                case "exit":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }
}
