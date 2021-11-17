public class Student {
    String name;
    int phone;
    int iuklId;
    String address;
    public Student(String name,int iuklId,int phone,String address){
        this.name=name;
        this.iuklId=iuklId;
        this.phone=phone;
        this.address=address;
    }
    void putData(String name,int iuklId,int phone,String address){
        this.name=name;
        this.iuklId=iuklId;
        this.phone=phone;
        this.address=address;
    }
    void Display(){
        System.out.println("Name:"+name+"\nIukl id:"+iuklId+"\nphone"+phone+"\naddress"+address);
    }
    public static void main(String[] args){
        Student student1=new Student("harry",1225,12255,"kalimati\n");
/*        student1.putData("harry",1225,12255,"kalimati\n");
        Student student2=new Student();
        student2.putData("harry",1625,12855,"jadibuti\n");
        Student student3=new Student();
        student3.putData("maish", 12995, 1229995, "bulgaria\n");*/

        student1.Display();
    }
}
