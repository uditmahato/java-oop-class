public class Parllelogram {
    int base;
    int height;
    public Parllelogram(int b,int h){
        this.base=b;
        this.height=h;
    }
    int calculateArea(){
        return base*height;
    }
    void display(){
        System.out.println("Height : "+height+"\nBase : "+base);
    }
    public static void main(String[] args) {
        Parllelogram sc=new Parllelogram(25,30);
        sc.display();
        Parllelogram sc2=new Parllelogram(25,60);
        int a2=sc2.calculateArea();
        int a= sc.calculateArea();
        System.out.println("The area of the given parllelogram is:"+ a);
        if(a<a2){
            System.out.println("The area of second parm is greater than than the first one");
        }
        else{
            System.out.println("The area of first parm is greater than the second one");
        }
    }
}
