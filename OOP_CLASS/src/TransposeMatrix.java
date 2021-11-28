//Write a JAVA program to calculate transpose of a given matrix
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        //scanner to take input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3*3 matrix that you want to transpose :");
        //array to take matrix input
        int [][] matrix=new int[3][3];
        //loop to take matrix as input
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] =sc.nextInt();
            }
        }
        //loop to print the matrix
        System.out.println("The matrix you entered is : ");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        //loop to transpose the matrix
        System.out.println("The transpose of the matrix you entered is : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println(" ");
        }
    }
}
