public class Task4 {
    public static void main(String[] args) {
        double INTEREST_RATE = 0.17;
        double initialBalance = 5000;
        double newBalance = (initialBalance * INTEREST_RATE) + initialBalance;
        System.out.println("Your credit card balance after one month is $" + newBalance);
        System.out.println("Your credit card balance after two months is $" + newBalance + initialBalance);
    }
}
