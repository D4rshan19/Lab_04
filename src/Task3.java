import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double summerCost;
        double fallCost;
        double winterCost;
        double springCost;
        System.out.println("What is your maintenance cost for the summer?");
        summerCost = scan.nextDouble();
        System.out.println("What is your maintenance cost for the fall?");
        fallCost = scan.nextDouble();
        System.out.println("What is your maintenance cost for the winter?");
        winterCost = scan.nextDouble();
        System.out.println("What is your maintenance cost for the spring?");
        springCost = scan.nextDouble();
        double annualCost = summerCost + fallCost + winterCost + springCost;
        System.out.println("Your annual cost for maintenance is $" + annualCost);
    }
}
