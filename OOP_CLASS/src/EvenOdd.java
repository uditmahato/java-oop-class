import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  //  a Scanner object
        System.out.println("Enter the number you want to  check");
        int x =myObj.nextInt();
        if (x%2==0){
            System.out.println("The "+ x+" that you entered is even" );
        }
        else{
            System.out.println("The "+ x+" that you entered is odd" );
        }
    }
}
