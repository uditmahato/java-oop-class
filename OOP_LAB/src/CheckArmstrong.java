import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Armstrong Number Checker");
        System.out.print("Enter the number that you want to check : ");
        int num= sc.nextInt();
        int copyNum=num;
        int len=0;
        while(copyNum!=0){
            copyNum=copyNum/10;
            len=len+1;
        }
        System.out.println("Your number is " +len+" digits");
        int anotherNewNum=num;
        int sum=0;
        int remain;
        int product=1;
        while(anotherNewNum>0){
            remain=anotherNewNum%10;
            anotherNewNum=anotherNewNum/10;
            product=1;
            for(int a=0;a<len;a++){
                product=product*remain;
            }
            sum=sum+product;
        }
        if(sum==num){
            System.out.println(num+" is an Armstrong Number");
        }
        else{
            System.out.println(num + " is not a armstrong number");
        }

    }
}
