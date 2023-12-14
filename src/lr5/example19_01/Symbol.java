package lr5.example19_01;

public class Symbol {
    private char symbol;

    protected int getSymbolCode() {
        return (int) symbol;
    }

    protected void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    protected void onScreen(int code) {
        System.out.printf("You have entered the character \"%s\" (ASCII - %s)", symbol, code);
    }
}
