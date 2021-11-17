public class NumericOutput {
    public static void main(String[] args) {
        int value1=1;
        float value2=(float) Math.PI;
        String value3="Hello";
        double value4=565.87678765;
        char value5='T';
        System.out.printf("%d",value1);
        System.out.println();
        System.out.printf("%f",value2);
        System.out.println();
        System.out.printf("%s",value3);
        System.out.println();
        System.out.printf("%.3f",value4);
        System.out.println();
        System.out.printf("%c",value5);
    }
}
