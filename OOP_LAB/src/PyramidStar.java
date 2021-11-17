public class PyramidStar {
    public static void main(String[] args){
        for(int i=5;i>0;i--){
            System.out.println(" ");
            for(int j=i;j>0;j--){
                System.out.print(" * ");
            }
            for(int k=0;k<i;k++){
                System.out.print(" * ");
            }
        }
    }
}
