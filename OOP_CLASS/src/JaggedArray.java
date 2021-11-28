// write a JAVA program to demonstrate a jagged array.

public class JaggedArray {
    public static void main(String[] args) {
        //Declared and Initialized jagged array
        int[][] jaggedArr= new int[][]  {
                {10, 20, 30 ,40},
                {50, 60, 70, 80, 90, 100},
                {110, 120},
                {1,2,3,4,5,10}
        };

        //loop to print all the elements of the above jagged array

        System.out.println("Here is the Jagged array ");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++)
                System.out.print(jaggedArr[i][j] + " ");
            System.out.println();
        }
    }
}
