import java.util.Scanner;
public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  //  a Scanner object
        System.out.println("Enter the total purchase  amount");
        double x = myObj.nextDouble();
        if (x < 1000) {
            double discount = x * 0.005;
            System.out.println("You will get discount of " + discount);
        } else if (x >= 1000 && x <= 2000) {
            double discount = x * 0.05;
            System.out.println("You will get discount of " + discount);
        } else if (x > 2000 && x <= 5000) {
            double discount = x * 0.07;
            System.out.println("You will get discount of " + discount);
        } else {
            double discount = x * 0.09;
            System.out.println("You will get discount of " + discount);
        }

    }
}
