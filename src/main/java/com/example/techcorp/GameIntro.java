package com.example.techcorp;

import java.util.Scanner;

public class GameIntro {

    private final Scanner scanner;

    public GameIntro() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        printWelcomeBanner();
        waitForEnter();
        showMainMenu();
    }

    private void printWelcomeBanner() {
        System.out.println("=======================================");
        System.out.println("      WELCOME TO TECH CORP SIMULATOR   ");
        System.out.println("=======================================");
        System.out.println("You are the new CEO of Tech Corp.");
        System.out.println("Your mission: grow the company,");
        System.out.println("manage employees, and deliver projects.");
        System.out.println();
    }

    private void waitForEnter() {
        System.out.println("Press ENTER to continue...");
        scanner.nextLine();
    }

    private void showMainMenu() {
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("============== MAIN MENU ==============");
            System.out.println("1. Start new simulation");
            System.out.println("2. View company overview");
            System.out.println("3. Help / Instructions");
            System.out.println("0. Exit");
            System.out.println("=======================================");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> startNewSimulation();
                case 2 -> showCompanyOverview();
                case 3 -> showHelp();
                case 0 -> System.out.println("Exiting Tech Corp Simulator. Goodbye!");
                default -> System.out.println("Unknown option. Please try again.");
            }
        }
    }

    private void startNewSimulation() {
        System.out.println();
        System.out.println("Starting a new simulation...");
        // TODO: later connect to your Company/Employee/Project logic
    }

    private void showCompanyOverview() {
        System.out.println();
        System.out.println("Company overview is not implemented yet.");
        // TODO: later print info from Company, Employees, Projects
    }

    private void showHelp() {
        System.out.println();
        System.out.println("============== HELP ===================");
        System.out.println("1 - Start a new simulation of Tech Corp.");
        System.out.println("2 - View basic information about your company.");
        System.out.println("0 - Exit the game.");
        System.out.println("Use numbers to navigate the menu.");
        System.out.println("=======================================");
    }
}