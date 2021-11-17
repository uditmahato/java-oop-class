import java.util.Scanner;
public class fibonacciSeries {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("What number of series do you want ?");
        int input= sc.nextInt();
        int a=0;int b=1;
        int c;
        for (int i=0;i<input;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
