import java.util.ArrayList;
import java.util.Scanner;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<Integer>();
        a.add(0,10);
        a.add(1,00);
        a.add(2,101);
        a.add(3,10101);
        a.add(4,101010);
        for(int i:a){
            System.out.println(i);
        }

    }
}
