import java.util.Scanner;
public class IdentifyDataType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string that you want to check : ");
        String mainStore=sc.nextLine();
        //Defined alphabets and numbers
        String numStore="0123456789";
        String alphabetStore="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //loop to check alphabets
        for(int i=0;i<mainStore.length();i++){
            char st=mainStore.charAt(i);
            //loop to print alphabets
            for (int j=0;j<52;j++){
                if(st==alphabetStore.charAt(j)){
                    System.out.println(st+"- alphabet");
                }
            }
            //loop to print numbers
            for (int k=0;k<10;k++){
                if(st==numStore.charAt(k)){
                    System.out.println(st+"- number");
                }
            }
        }
        sc.close();
    }
}
