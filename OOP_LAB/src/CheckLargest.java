import java.util.Scanner;
public class CheckLargest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  //  a Scanner object
        System.out.println("Enter the three number");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();
        if (num1 >= num2) {
            if(num1>num3){
                System.out.println(num1 +" is largest among the three numbers");
            }
        }
        else{
            if(num3>=num1){
                if(num3>num2){
                    System.out.println(num3 +" is largest among the three numbers");
                }
                else{

                    System.out.println(num2 +" is largest among the three numbers");
                }
            }
        }
    }
}