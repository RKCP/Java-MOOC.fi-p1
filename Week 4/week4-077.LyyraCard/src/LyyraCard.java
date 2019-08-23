/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkcp
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() { // we set what sout(objectName) will automatically print here.
        return "The card has " + this.balance + " euros"; // without this toString, if we just sout(objectName) we will get an error.
    }
    
    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance = this.balance - 2.5; // seems like you can't just manipulate this.balance directly without using the asign (=) operator.
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance = this.balance - 4.0;
        }
    }
    
    public void loadMoney(double amount) {
        
        if (amount >= 0) {
            this.balance += amount;
        
            if(this.balance > 150.0) {
                this.balance = 150.0;
            }
        }
    }
    
}
