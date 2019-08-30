
public class CashRegister {

    private double cashInRegister; // money in the cash register
    private int economicalSold; // the AMOUNT of economical lunches sold
    private int gourmetSold; // the AMOUNT of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        
        double change = 0;
        double ecoLunchCost = 2.50;
        if (cashGiven >= ecoLunchCost) {
            this.cashInRegister += ecoLunchCost;
            this.economicalSold ++;
            change = cashGiven - ecoLunchCost;
        }else {
            return cashGiven;
        }
        
        return change;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        
        double change = 0;
        double gourLunchCost = 4.00;
        if (cashGiven >= gourLunchCost) {
            this.cashInRegister += gourLunchCost;
            this.gourmetSold ++;
            change = cashGiven - gourLunchCost;
        }else {
            return cashGiven;
        }
        
        return change;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        
        double ecoLunchCost = 2.50;
        if (card.balance() >= ecoLunchCost) {
            card.pay(ecoLunchCost);
            this.economicalSold ++;
            return true;
        }else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        
        double gourLunchCost = 4.00;
        if (card.balance() >= gourLunchCost) {
            card.pay(gourLunchCost);
            this.gourmetSold ++;
            return true;
        }else {
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        // method loads cash to Lyyra Cards. Must be positive amount.
        // the amount stored in the register increases correspondingly when card loaded, as that cash goes into the register.
        
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }



    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
