//write a java program to find the duplicate val;ues of an array of integer values
import java.util.Scanner;
import java.util.Arrays;
public class FindDuplicateinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number do you want to compare: ");
        int count=sc.nextInt();
        int[] Store=new int[count];
        System.out.println("Enter the numbers that you want to compare");
        for(int i=0;i<count;i++){
            Store[i]=sc.nextInt();
        }
        System.out.println("The numbers that you entered are:\n"+Arrays.toString(Store));
        for(int i=0;i<count;i++){
            for(int c=i+1;c<count;c++){
                if(Store[i]==Store[c]){
                    System.out.println("The duplicate value is"+Store[i]);
                }
                else{
                    System.out.print("");
                }
            }
        }
    }
}
