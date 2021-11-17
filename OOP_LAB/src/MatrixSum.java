import java.util.Scanner;
import java.util.Arrays;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the number for 3 * 3 matrix : ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.print("Your matrix is");
        int row_sum=0;
        int column_sum = 0;
        for(int i=0;i<3;i++)
        {
            System.out.println();
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }

        }
        for(int i=0;i<3;i++)
        {
            System.out.println();
            for(int j=0;j<3;j++)
            {
                row_sum+=arr[i][j];
            }
            System.out.println(row_sum);

        }
        for(int i=0;i<3;i++)
        {
            System.out.println();
            for(int j=0;j<3;j++)
            {
                column_sum+=arr[j][i];
            }
        }
    }

}
