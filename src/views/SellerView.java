package views;

import models.Seller;
import utils.Validator;
import java.util.Scanner;


public class SellerView {

    Seller model;
    String title;
    String name;
    double hours;
    double hourlyWage;
    Scanner scanner;

    public SellerView(Seller model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите имя продавца: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество отработанных часов: ";
        System.out.print(title);
        hours = Validator.validatePriceInput(scanner);
        model.setHours(hours);

        title = "Введите почасовую зарплату (грн.): ";
        System.out.print(title);
        hourlyWage = Validator.validatePriceInput(scanner);
        model.setHourlyWage(hourlyWage);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
