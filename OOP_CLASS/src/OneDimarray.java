public class OneDimarray {
    public static void main(String[] args) {
        int i,j=0;
        int a[]=new int[5];
        System.out.println("intializing array..........");
        for(i=0;i<a.length;i++){
            a[i]=j;
            j++;
        }
        System.out.println("following are the elements of the array");
        for(int e:a){
            System.out.println(e);
        }
        System.out.println();
    }
}
