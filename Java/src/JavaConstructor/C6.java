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

    public void removePlayer(int index){
        if(index > players.size()){
            System.out.println("Index out of bound");
            return;
        }
        players.remove(index);
    }

    public static void main(String[] args) {
        String[] team = {"Aswin", "Melwin", "Joel"};
        C6 obj = new C6(team);


    }
}
