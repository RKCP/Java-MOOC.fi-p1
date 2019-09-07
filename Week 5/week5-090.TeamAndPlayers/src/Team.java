
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkcp
 */
public class Team {
    
    private String name;
    private ArrayList<Player> playerList;
    private int maxListSize = 16;

    public Team(String name) {
        this.name = name;
        this.playerList = new ArrayList<Player>(); // Don't forget to initialize the ArrayList here otherwise you get null Pointer exception
    }

    public String getName() {
        return this.name;
    }
    
    public int size() {
        return this.playerList.size();
    }
    
    public void setMaxSize(int maxSize) {
        this.maxListSize = maxSize;
    }
    
    public void addPlayer(Player playerName) {
        if (size() < this.maxListSize) {
            this.playerList.add(playerName);
        } 
    }
    
    public void printPlayers() {
        for (Player player: playerList) {
            System.out.println(player);
        }
    }
    
    public int goals() {
        int totalGoals = 0;
        for (Player player: playerList) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
    
    
    
}
