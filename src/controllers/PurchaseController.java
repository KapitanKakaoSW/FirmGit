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

        double priceInitial = model.calculatePurchase(model.getPrice(), model.getAmount());
        String priceInitialRounded = Rounder.roundValue(priceInitial);

        double tax = model.calculateTax(priceInitial);
        String taxRounded = Rounder.roundValue(tax);

        double price = model.calculatePurchase(priceInitial, tax);
        String priceRounded = Rounder.roundValue(price);

        String output = "Цена товара: " + priceInitialRounded + "\nСумма налога: " +
                taxRounded + "\nЧистая прибыль: " + priceRounded;

        view.getOutput(output);
    }
}
