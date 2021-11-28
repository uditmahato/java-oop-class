import java.util.ArrayList;
public class ToArray {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(10);
        age.add(20);
        age.add(30);
        Integer a[] = new Integer[age.size()];
        a = age.toArray(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
