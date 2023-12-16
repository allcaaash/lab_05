package lr5.example19_05;

public class MainClass {
    public static void main(String[] args) {
        MyClass objOne = new MyClass(10);
        System.out.printf("The value is set via the constructor (num = %S)\n", objOne.getNum());
        objOne = null;

        MyClass objTwo = new MyClass();
        objTwo.setNum();
        System.out.printf("The value is set via an empty setter (num = %S)\n", objTwo.getNum());
        objTwo = null;

        MyClass objThree = new MyClass();
        int value = 1000;
        objThree.setNum(value);
        System.out.printf("The value (%s) is set with verification (num = %S)\n", value, objThree.getNum());
        objThree = null;
    }
}
