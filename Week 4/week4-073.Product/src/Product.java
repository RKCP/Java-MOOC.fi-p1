/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkcp
 */
public class Product {

    private String nameAtStart;
    private double priceAtStart;
    private int amounAtStart;

    public Product(String nameAtStart, double priceAtStart, int amounAtStart) {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amounAtStart = amounAtStart;
    }
    
    public void printProduct() {
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amounAtStart);
    }
    
    
}
