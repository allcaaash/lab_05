package lr5.example19_06;

public class MainClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass(0, 10);
        obj.onScreen();

        obj.setValue(100);
        obj.onScreen();

        obj.setValue(-100);
        obj.onScreen();

        obj.setValue(200, -200);
        obj.onScreen();

        obj.setValue(5, -250);
        obj.onScreen();

        obj.setValue(250, -10);
        obj.onScreen();
    }
}
