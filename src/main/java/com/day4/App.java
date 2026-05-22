package com.day4;

import com.day4.exceptions.InvalidInputException;
import com.day4.services.TicketService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TicketService service = new TicketService();

        while (true) {
            System.out.println("\n===== Ticketing System =====");
            System.out.println("1. Add Ticket");
            System.out.println("2. List Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine().trim());

            if (choice == 1) {
                System.out.print("Enter your name         : ");
                String name = scanner.nextLine();

                System.out.print("Enter your age          : ");
                int age = Integer.parseInt(scanner.nextLine().trim());

                System.out.print("Enter ticket title      : ");
                String title = scanner.nextLine();

                System.out.print("Enter ticket description: ");
                String description = scanner.nextLine();

                try {
                    service.addTicket(title, description, name, age);
                } catch (InvalidInputException e) {
                    service.logError(e);
                }

            } else if (choice == 2) {
                service.listTickets();

            } else if (choice == 3) {
                System.out.println("👋 Exiting. Goodbye!");
                break;

            } else {
                System.out.println("⚠️  Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}