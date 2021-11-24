import controllers.ClientController;
import controllers.PurchaseController;
import controllers.SellerController;
import models.Client;
import models.Purchase;
import models.Seller;
import utils.Validator;
import views.ClientView;
import views.PurchaseView;
import views.SellerView;

import java.util.Scanner;

// Входная точка в программу/приложение
public class Main {

    static int number;

    public static void main(String[] args) {

        System.out.println("""
                Выберите операцию (введите цифру операции)
                1. Расчёт суммы покупки и скидки.
                2. Расчёт налога с продаж.
                3. Расчёт зарплаты продавца.""");

        Scanner scan = new Scanner(System.in);

        number = Validator.validateOperationNumberInput(scan);

        switch (number) {
            case 1 -> clientPurchaseStart();
            case 2 -> purchasePriceStart();
            case 3 -> sellerSalaryStart();
        }
    }

    public static void clientPurchaseStart() {
        Client model = new Client();
        ClientView view = new ClientView(model);
        ClientController controller = new ClientController(model, view);
        controller.runApp();
    }

    public static void purchasePriceStart() {
        Purchase model = new Purchase();
        PurchaseView view = new PurchaseView(model);
        PurchaseController controller = new PurchaseController(model, view);
        controller.runApp();
    }

    public static void sellerSalaryStart() {
        Seller model = new Seller();
        SellerView view = new SellerView(model);
        SellerController controller = new SellerController(model, view);
        controller.runApp();
    }
}
