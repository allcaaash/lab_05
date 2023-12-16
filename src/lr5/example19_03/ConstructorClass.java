package lr5.example19_03;

public class ConstructorClass {

    public ConstructorClass() {

    }
    public ConstructorClass(int num) {
        firstValue = num;
    }
    public ConstructorClass(int firstNum, int secondNum) {
        firstValue = firstNum;
        secondValue = secondNum;
    }
    static protected int firstValue = 0;
    static protected int secondValue = 0;


}
