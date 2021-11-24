package base;

public interface Price {

    double calculatePurchase(int amount, double price);

    double calculatePurchase(double totalPrice, double tax);
}
