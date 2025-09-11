import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userTemp;
        System.out.println("Hi, whats the temperature in degrees fahrenheit?");
        userTemp = scan.nextInt();
        int tempC = (userTemp -32) * 5/9;
        System.out.println("The temperature is " + tempC + " degrees celsius");
    }
}
