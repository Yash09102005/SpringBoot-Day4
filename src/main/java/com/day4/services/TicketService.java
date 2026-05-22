package com.day4.services;

import com.day4.exceptions.InvalidInputException;
import com.day4.models.Ticket;
import com.day4.models.User;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TicketService {

    private ArrayList<Ticket> tickets = new ArrayList<>();
    private int idCounter = 1;

    public void addTicket(String title, String description, String name, int age)
            throws InvalidInputException {

        if (age <= 0 || age >= 120) {
            throw new InvalidInputException("Invalid age: " + age);
        }
        if (title == null || title.trim().isEmpty()) {
            throw new InvalidInputException("Title cannot be empty.");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new InvalidInputException("Description cannot be empty.");
        }

        User user = new User(name, age);
        Ticket ticket = new Ticket(idCounter++, title, description, user);
        tickets.add(ticket);
        System.out.println("Ticket added successfully!");
    }

    public void listTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets found.");
        } else {
            System.out.println("\n========= All Tickets =========");
            for (Ticket t : tickets) {
                System.out.println(t);
            }
            System.out.println("================================");
        }
    }

    public void logError(Exception e) {
        try {
            FileWriter fw = new FileWriter("error.log", true);
            fw.write("[ERROR] " + e.getMessage() + "\n");
            fw.close();
            System.out.println("Error logged: " + e.getMessage());
        } catch (IOException ioException) {
            System.out.println("Could not write to log file.");
        }
    }
}