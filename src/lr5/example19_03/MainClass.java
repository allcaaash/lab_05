package lr5.example19_03;

public class MainClass {
    public static void main(String[] args) {
        ConstructorClass exOne = new ConstructorClass();
        System.out.printf("firstValue = %s, secondValue = %s (The object was created without arguments)\n", ConstructorClass.firstValue, ConstructorClass.secondValue);

        ConstructorClass exTwo = new ConstructorClass(1);
        System.out.printf("firstValue = %s, secondValue = %s (The object was created with a single argument)\n", ConstructorClass.firstValue, ConstructorClass.secondValue);
        exTwo = null;

        ConstructorClass exThree = new ConstructorClass(10, 11);
        System.out.printf("firstValue = %s, secondValue = %s (The object was created with two arguments)", ConstructorClass.firstValue, ConstructorClass.secondValue);
        exThree = null;
    }
}
