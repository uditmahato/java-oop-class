public class MultiDImarray {
    public static void main(String[] args) {
        int i,j,k=0;
        int a[][]=new int[2][4];
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                a[i][j]=k;
                k++;
            }
        }
        //for ptinting matrix
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }

    }
}
