package JavaConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Implement a class Team that initializes a list of players using an array passed as a parameter to the constructor.
public class C6 {
    private List<String> players;

    C6(String[] player){
        this.players = new ArrayList<>(Arrays.asList(player));
    }

    public void addPlayer(String name){
        players.add(name);
    }

    public void removeFirst(){
        players.removeFirst();
    }
    public List<String> getPlayers() {
        return players;
    }

    public static void main(String[] args) {
        String[] team = {"Aswin", "Melwin", "Joel"};
        C6 obj = new C6(team);

        System.out.println("Team list\n"+ obj.getPlayers());

        System.out.println("\nAdding players");
        obj.addPlayer("Davis");
        System.out.println(obj.getPlayers());

        System.out.println("\nRemoving players");
        obj.removeFirst();
        System.out.println(obj.players);
    }
}