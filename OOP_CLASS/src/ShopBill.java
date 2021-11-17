import java.util.Scanner;
public class ShopBill{
    public static void main(String[] args) {
        int option;
        String product;
        double total_amt;
        double total;
        String ans;
        Scanner sc= new Scanner(System.in);  //  a Scanner object
        String test = "yes";
        System.out.printf("%s\n","Enter 1 for Bill \nEnter 2 for Display All Purchased Item \nEnter 3 to print Result \nAny other number to exit");
        option=sc.nextInt();
        do{
            switch (option){
                case 1:
                    System.out.printf("%s\n","Do you want to add product");
                    do {
                        ans=sc.next();
                    }
                    while(ans.equals(test));
                    break;
                case 2:
                case 3:
            }
            System.out.println("Do YOu want to continue the loop");

        }
        while(option==1||option==2||option==3);
    }
}
