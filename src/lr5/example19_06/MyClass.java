package lr5.example19_06;

public class MyClass {
    private int min;
    private int max;

    MyClass(int valueOne, int valueTwo) {
        if (valueOne < valueTwo) {
            min = valueOne;
            max = valueTwo;
        }
        else {
            min = valueTwo;
            max = valueOne;
        }
    }

    public void setValue(int value) {
        if (value < min) {
            this.min = value;
        }
        else if (value > max) {
            this.max = value;
        }
    }
    public void setValue(int valueOne, int valueTwo) {

        if (valueOne < min) {
            this.min = valueOne;
        }
        if (valueOne > max) {
            this.max = valueOne;
        }
        if (valueTwo < min) {
            this.min = valueTwo;
        }
        if (valueTwo > max) {
            this.max = valueTwo;
        }
    }

    public void onScreen() {
        System.out.printf("Min value is equal %s, max value is equal %s\n", min, max);
    }
}
