import controllers.ClientController;
import controllers.PurchaseController;
import models.Client;
import models.Purchase;
import utils.Validator;
import views.ClientView;
import views.PurchaseView;
import java.util.Scanner;

// Входная точка в программу/приложение
public class Main {

    static int number;

    public static void main(String[] args) {

        System.out.println("""
                Выберите операцию (введите цифру операции)
                1. Расчёт суммы покупки и скидки.
                2. Расчёти налога с продаж.""");

        Scanner scan = new Scanner(System.in);

        number = Validator.validateOperationNumberInput(scan);

        switch (number) {
            case 1 -> clientPurchaseStart();
            case 2 -> purchasePriceStart();
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
}


    /*public void runApp() {

        System.out.println("""
                Выберите операцию (введите цифру операции)
                1. Расчёт суммы покупки и скидки.
                2. Расчёти налога с продаж.
                3. Расчёт зарплаты продавца.""");

        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) {
            System.out.printf("\"%s\" - не число! Введите число.\n", scan.nextLine());
            runApp();
        }
        switch (scan.nextInt()) {
            case 1 -> clientPurchaseController();
            case 2 -> purchaseAmountController();
            case 3 -> sellerSalaryController();
            default -> {
                System.out.println("Неверный номер операции. Попробуйте ещё раз.");
                runApp();
            }
        }
    }*/

  /*  public static void main(String[] args) {

        Client model = new Client();
        ClientView view = new ClientView(model);
        ClientController controller = new ClientController(model, view);
        // Запуск программы/приложения
        controller.runApp();
    }*/