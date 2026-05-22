package com.day4.models;

public class Ticket {
    private int ticketId;
    private String title;
    private String description;
    private User createdBy;

    public Ticket(int ticketId, String title, String description, User createdBy) {
        this.ticketId = ticketId;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    @Override
    public String toString() {
        return "\n--- Ticket #" + ticketId + " ---" +
                "\nTitle       : " + title +
                "\nDescription : " + description +
                "\nCreated By  : " + createdBy;
    }
}
