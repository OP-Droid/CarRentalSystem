# CarRentalSystem
Project Description

This project is a simple Car Rental System developed in Java following Object-Oriented Programming (OOP) principles. It allows a rental agency to manage cars and customers, handle car rentals, and process returns.

The system is designed to demonstrate the use of key OOP concepts such as encapsulation, inheritance, and polymorphism.
Features

Car Management: Add and track the availability of cars.
Customer Management: Register and maintain customer details.
Car Rentals: Allow customers to rent available cars.
Car Returns: Process the return of rented cars.

Technologies Used
Programming Language: Java
Development Environment: IntelliJ IDEA / Eclipse (or any preferred Java IDE)
Version Control: GitHub

Project Structure

CarRentalSystem/
├── src/
│   ├── Car.java               # Car entity class
│   ├── Customer.java           # Customer entity class
│   ├── RentalAgency.java       # Core system logic for rentals
│   ├── Main.java               # Entry point for the application
└── README.md                   # Project documentation

Installation Instructions

1. Clone the repository:
git clone <GitHub Repository URL>
cd CarRentalSystem

2. Compile the source code:

javac src/*.java

3. Run the application:

java src.Main

Usage Instructions

1. The program will create an initial set of cars and customers.
2. You can test the following functionalities by updating the Main.java:

Rent a car
Return a car

3. Example interaction from the program:
Ian Opicho successfully rented Toyota Corolla
Car successfully returned.

Key Classes

1. Car.java: Represents a car entity with attributes for the registration number, model, and availability status.
2. Customer.java: Represents customer details such as name and license number.
3. RentalAgency.java: Manages cars, customers, and rental transactions.
4. Main.java: Serves as the entry point to execute the system.

OOP Principles Demonstrated

Encapsulation: Private attributes with public getter and setter methods.

Abstraction: Simplified representation of cars and customers in the system.

Modularization: Clear separation of responsibilities in different classes.


Future Enhancements

User Interface: Add a graphical or web interface for better user interaction.

Data Persistence: Store car and customer data in a database.

Advanced Features: Support for payment processing, rental history tracking, and car availability calendar.


Author
Ian Opicho

License

This project is licensed under the MIT License.
