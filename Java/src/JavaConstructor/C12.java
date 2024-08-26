package JavaConstructor;
// Implement a class DatabaseConnection using the Singleton pattern with a private constructor.
public class C12 {
    private static C12 database;

    private C12 (){
        System.out.println("Database connection is established");
    }

    public static C12 getInstance(){
        if(database == null){
            database = new C12();
        }
        return database;
    }
    public void connect(){
        System.out.println("Connecting to the database..");
    }
    public void disconnect(){
        System.out.println("Disconnecting from the database..");
    }

    public static void main(String[] args) {
        C12 databaseConnection = getInstance();

        databaseConnection.connect();
        databaseConnection.disconnect();

        System.out.println();

        C12 secondaryConnection = getInstance();
        secondaryConnection.connect();
        secondaryConnection.disconnect();

        System.out.println();

        if(databaseConnection == secondaryConnection){
            System.out.println("Instance are same");
        } else {
            System.out.println("Both the instance are different");
        }
    }
}