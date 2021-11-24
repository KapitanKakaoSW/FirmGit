package models;

import base.Price;
import base.Tax;

public class Purchase implements Price, Tax  {

    private int amount;
    private double price;
    private final static double TAX_RATE = 20;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public double calculatePurchase(int amount, double price) {
        return price * amount;
    }

    @Override
    public double calculatePurchase(double totalPrice, double tax) {
        return totalPrice - tax;
    }

    @Override
    public double calculateTax(double totalPrice) {
        return totalPrice * TAX_RATE / 100;
    }
}
