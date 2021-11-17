import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args){
        char x,a,e,i,o,u;                          //initialized value that I will be using
        String s;
        Scanner sc=new Scanner(System.in);         //used scanner to accept  string from user
        System.out.println("Enter the string that you want to check");
        String rs=sc.next();
        //used for loop to access each character of string
        for (int p=0;p<rs.length();p++){
            x=rs.charAt(p);                        //check each character
            switch (x){
                case 'a':
                case 'A':
                    System.out.println(x+" is a vowel ");
                    break;
                case 'e':
                case 'E':
                    System.out.println(x+" is a vowel");
                    break;
                case 'i':
                case 'I':
                    System.out.println(x+"  is a vowel");
                    break;
                case 'o':
                case 'O':
                    System.out.println(x+" is a vowel");
                    break;
                case 'u':
                case 'U':
                    System.out.println(x+" is a vowel");
                    break;
                default:
                    System.out.println(x+" is a consonant ");
            }
        }
    }
}
