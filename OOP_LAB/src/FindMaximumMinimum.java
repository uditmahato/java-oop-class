//Write a java program to find maximum and minimum value of an array
import java.util.Scanner;
import java.util.Arrays;
public class FindMaximumMinimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number do you want to compare: ");
        int count=sc.nextInt();
        int[] Store=new int[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter the numbers that you want to compare");
            Store[i]=sc.nextInt();
        }
        System.out.println("The numbers that you want to compare are:"+Arrays.toString(Store));
        Arrays.sort(Store);
        System.out.println("Minimum values is : "+Store[0]);
        System.out.println("Maximum value is : "+Store[count-1]);
    }
}
