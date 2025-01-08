package JavaConstructor;

// Implement a class DatabaseConnection using the Singleton pattern with a private constructor.
public class DatabaseConnection {      // Creating a class named 'DatabaseConnection' that contains 'database'
    // Creating instance variables for the class

    private static DatabaseConnection database;        // Crating a variable to store the database

    private DatabaseConnection() {        // Creating a default constructor that takes no arguments
        System.out.println("Database connection is established");
    }

    public static DatabaseConnection getInstance() {       // Creating a getter method to get the instance variable database
        if (database == null) {         // Checking if the database is empty
            database = new DatabaseConnection();       // Creating a new database, if its empty
        }
        return database;        // Returning the database
    }

    public void connect() {         // Method to connect the database
        System.out.println("Connecting to the database..");
    }

    public void disconnect() {      // Method to disconnect the database
        System.out.println("Disconnecting from the database..");
    }

    public static void main(String[] args) {        // Main method
        DatabaseConnection databaseConnection = getInstance();       // Creating an objects by calling the method

        databaseConnection.connect();       // Calling the method to connect the database
        databaseConnection.disconnect();        // Calling the method to disconnect the database

        System.out.println();

        DatabaseConnection secondaryConnection = getInstance();        // Creating another object by calling the method
        secondaryConnection.connect();       // Calling the method to connect the database
        secondaryConnection.disconnect();       // Calling the method to disconnect the database

        System.out.println();

        if (databaseConnection == secondaryConnection) {        // Checking if both the database are same
            System.out.println("Instance are same");
        } else {
            System.out.println("Both the instance are different");
        }
    }
}