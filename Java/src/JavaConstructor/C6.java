package JavaConstructor;

import java.util.ArrayList;     // Importing array list class
import java.util.Arrays;        // Importing arrays class
import java.util.List;      // Importing list class

// Implement a class Team that initializes a list of players using an array passed as a parameter to the constructor.
public class C6 {       // Creating a class named 'Team' which contains player details
    private List<String> players;       // Creating an instance variable of type list

    C6(String[] player) {       // Creating a parameterized constructor that takes array as an arguments
        // Initialing values to the instance variables by converting array into array list
        this.players = new ArrayList<>(Arrays.asList(player));
    }

    public void addPlayer(String name) {        // Creating a method to add player in the list
        players.add(name);      // Adding player
    }

    public void removeFirst() {      // Creating a method to remove player at the first
        players.removeFirst();      // Removing player
    }
    public List<String> getPlayers() {      // Creating a getter method to get the instance variable players
        return players;     // Returning the value of players
    }

    public static void main(String[] args) {        // Main method
        String[] team = {"Aswin", "Melwin", "Joel"};        // Creating an array that holds the player names
        C6 obj = new C6(team);      // Creating an objects by passing string as an arguments

        System.out.println("Team list\n" + obj.getPlayers());       // Calling the getter method to access the instance variable player

        System.out.println("\nAdding players");
        obj.addPlayer("Davis");     // Calling the method to add players
        System.out.println(obj.getPlayers());       // Displaying the player list

        System.out.println("\nRemoving players");
        obj.removeFirst();      // Calling the method to remove player at first
        System.out.println(obj.players);        // Displaying the player list
    }
}