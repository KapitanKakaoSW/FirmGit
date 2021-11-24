package controllers;

import models.Purchase;
import utils.Rounder;
import views.PurchaseView;


public class PurchaseController {

    Purchase model;
    PurchaseView view;

    public PurchaseController(Purchase model, PurchaseView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        double priceInitial = model.calculatePurchase(model.getAmount(), model.getPrice());
        String priceInitialRounded = Rounder.roundValue(priceInitial);

        double tax = model.calculateTax(priceInitial);
        String taxRounded = Rounder.roundValue(tax);

        double price = model.calculatePurchase(priceInitial, tax);
        String priceRounded = Rounder.roundValue(price);

        String output = "Цена товара: " + priceInitialRounded + " грн." + "\nСумма налога: " +
                taxRounded + " грн." + "\nЧистая прибыль: " + priceRounded + " грн.";

        view.getOutput(output);
    }
}
