public class Task4 {
    public static void main(String[] args) {
        double INTEREST_RATE = 0.17;
        double initialBalance = 5000;
        double oneBalance = (initialBalance * INTEREST_RATE) + initialBalance;
        double twoBalance = (oneBalance * INTEREST_RATE) + oneBalance;
        System.out.println("Your credit card balance after one month is $" + oneBalance);
        System.out.println("Your credit card balance after two months is $" + twoBalance);
    }
}
