package lr5.example19_04;

public class MyClass {
    MyClass(int userNum, char userSymbol) {
        num = userNum;
        symbol = userSymbol;
    }

    MyClass (double dot) {
        int symbolCode = (int) dot;
        int numValue = (int) ((dot - symbolCode) * 100);

        symbol = (char) symbolCode;
        num = numValue;
    }

    private char symbol;
    private int num;

    public char getSymbol() {
        return symbol;
    }

    public int getNum() {
        return num;
    }
}
