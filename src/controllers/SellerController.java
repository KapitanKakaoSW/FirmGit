package controllers;

import models.Seller;
import utils.Rounder;
import views.SellerView;

public class SellerController {

    Seller model;
    SellerView view;
    double bonus;

    public SellerController(Seller model, SellerView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double salaryInitial = model.salaryCalculation(model.getHourlyWage(), model.getHours());
        String salaryInitialRounded = Rounder.roundValue(salaryInitial);

        if (model.getHours() >= 132 & model.getHours() < 160) {
            bonus = salaryInitial * 0.05;
        } else if (model.getHours() >= 160 & model.getHours() < 192) {
            bonus = salaryInitial * 0.1;
        } else if (model.getHours() >= 192) {
            bonus = salaryInitial * 0.2;
        }

        String bonusRounded = Rounder.roundValue(bonus);

        String output = "Имя продавца: " + name + "\nСумма зарплаты: " + salaryInitialRounded + " грн."
                + "\nСумма премии: " + bonusRounded + " грн.";

        view.getOutput(output);
    }
}
