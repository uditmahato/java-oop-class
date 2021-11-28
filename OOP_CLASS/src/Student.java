import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student1{
    String name;
    double[] marks;

    public Student1(String name){
        this.name=name;
        this.marks = new double[5];
    }
    public String getName()
    {
        return this.name;
    }
    public double getPercent()
    {
        double sum = 0;
        for(int j=0;j<5;j++)
        {
            sum = sum+this.marks[j];
        }
        return (sum/5);
    }
    public void display_marks(){
        for(int j=0;j<5;j++)
        {
            System.out.print(this.marks[j]+" ");
        }
    }
    public void getRank()
    {
        //
    }

}

public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student1> st = new ArrayList<Student1>();
        ArrayList<Double> score = new ArrayList<Double>();
        HashMap<Student1, Double>result = new HashMap<Student1, Double>();

        Student1 s;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter name and marks obtained in 5 subjects for student :"+i+1);
            String name = sc.next();
            s = new Student1(name);
            for(int j=0;j<5;j++)
            {
                s.marks[j] = sc.nextDouble();
            }
            st.add(s);
        }

        System.out.println("Following are the details of students: ");
        for(int i=0;i<st.size();i++)
        {
            s = st.get(i);
            System.out.print("Name: "+(s.getName())+ "\t");
            s.display_marks();
            System.out.print(s.getPercent());
            System.out.println();
            double pc = s.getPercent();
            score.add(pc);
            result.put(s, s.marks[i]);
        }
        System.out.println(result);


    }
}