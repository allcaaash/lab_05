package lr5.example19_01;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Symbol symbol = new Symbol();

        System.out.print("Specify the character to display its code: ");
        symbol.setSymbol(in.next().charAt(0));

        symbol.onScreen(symbol.getSymbolCode());

        in.close();
    }
}
