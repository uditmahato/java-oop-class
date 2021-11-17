import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number that you want to check : ");
        int num=sc.nextInt();
        int nwnum=num;
        int remain;
        int x=0;
        while(nwnum!=0){
            remain=nwnum%10;
            x=x*10+remain;
            nwnum=nwnum/10;
        }
        if(x==num){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}
