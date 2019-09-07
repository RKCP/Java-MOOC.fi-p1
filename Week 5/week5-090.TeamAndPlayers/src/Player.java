/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkcp
 */
public class Player {
    
    private String name;
    private int numberOfGoals;

    public Player(String playerName) {
        this.name = playerName;
    }

    public Player(String playerName, int numberOfGoals) {
        this.name = playerName;
        this.numberOfGoals = numberOfGoals;
    }

    public String getName() {
        return this.name;
    }
    
    public int goals() {
        return this.numberOfGoals;
    }
    
    public String toString() {
        return this.name + ", goals " + this.numberOfGoals; 
    }
    
}
