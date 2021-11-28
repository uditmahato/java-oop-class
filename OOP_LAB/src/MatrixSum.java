import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our average calculator");
        System.out.println("Enter the elements of your 3*3 matrix");
        int sizeStore=3;
        double [][] Store= new double[sizeStore][sizeStore];
        for (int i=0;i<sizeStore;i++){
            for(int j=0;j<sizeStore;j++){
                Store[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 3*3 matrix that you entered is : ");
        float rowSum=0;
        float columnSum=0;
        for (int i=0;i<sizeStore;i++){
            rowSum=0;
            for(int j=0;j<sizeStore;j++){
                System.out.print(Store[i][j]+"   ");
                rowSum+=Store[i][j];
                if (j>=(sizeStore-1)){
                    System.out.print(rowSum);
                }
            }
            System.out.println(" \t");
        }
        float WholecolumnSum=0;
        for (int i=0;i<sizeStore;i++){
            float x = columnSum;
            for(int j=0;j<sizeStore;j++){
                x+=Store[j][i];
            }
            WholecolumnSum+=x;
            System.out.print(x+ "  ");
            if(i>1){
                System.out.println(WholecolumnSum);
            }
        }
    }
}
