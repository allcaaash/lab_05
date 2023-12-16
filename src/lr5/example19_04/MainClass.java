package lr5.example19_04;

public class MainClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10, '$');
        System.out.printf("num = %s, symbol = %s (The object was created using int and char)\n", obj.getNum(), obj.getSymbol());
        obj = null;

        MyClass objTwo = new MyClass(1.056);
        System.out.printf("num = %s, symbol = %s (The object was created using double)\n", objTwo.getNum(), objTwo.getSymbol());
        objTwo = null;
    }
}
