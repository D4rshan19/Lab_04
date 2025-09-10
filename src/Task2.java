import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double purchasePrice;
        double SALES_TAX = 0.05;
        System.out.println("What was the price of your purchase?");
        purchasePrice = scan.nextDouble();
        double totalPrice = (purchasePrice * SALES_TAX) + purchasePrice;
        System.out.println("The total cost for your purchase will be $" + totalPrice);
    }
}
