//1.Write java program to find out average of all the elements in the given array(int or double);
import java.util.Scanner;
public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our average calculator");
        System.out.println("Enter the elements of your 3*3 matrix");
        int sizeStore=3;
        int [][] Store= new int [sizeStore][sizeStore];
        for (int i=0;i<sizeStore;i++){
            for(int j=0;j<sizeStore;j++){
                Store[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 3*3 matrix that you entered is : ");
        for (int i=0;i<sizeStore;i++){
            for(int j=0;j<sizeStore;j++){
                System.out.print(Store[i][j]+" ");
            }
            System.out.println(" ");
        }
        float sum=0;
        int count=0;
        for (int i=0;i<sizeStore;i++){
            for(int j=0;j<sizeStore;j++){
                sum+=Store[i][j];
                count++;
            }
        }
        System.out.println("Average of the Matrix you entered is : "+(sum/count));
    }
}
