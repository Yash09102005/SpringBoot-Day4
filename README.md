Day 4 - Project 2: Menu-Driven Ticketing System



Project Name

day4proj2



Objective

A Java console-based ticketing system that allows user interaction through a simple menu.



Technologies Used

\- Java 17

\- Maven

\- VS Code



Project Structure

day4proj2/

├── src/main/java/com/day4/

│   ├── App.java

│   ├── models/

│   │   ├── User.java

│   │   └── Ticket.java

│   ├── services/

│   │   └── TicketService.java

│   └── exceptions/

│       └── InvalidInputException.java

├── pom.xml

└── error.log



Features

\- Add a new ticket with user details

\- View all submitted tickets

\- Input validation with custom exceptions

\- Error logging to error.log file

\- Menu-driven console interface



How to Run

mvn compile

mvn exec:java



Menu Options

1\. Add Ticket

2\. List Tickets

3\. Exit

