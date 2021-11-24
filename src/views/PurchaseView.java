package views;

import models.Purchase;
import utils.Validator;
import java.util.Scanner;


public class PurchaseView {

    Purchase model;
    String title;
    int amount;
    double price;
    Scanner scanner;

    public PurchaseView(Purchase model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите количество товара: ";
        System.out.print(title);
        amount = Validator.validateQuantityInput(scanner);
        model.setAmount(amount);

        title = "Введите цену товара: ";
        System.out.print(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
