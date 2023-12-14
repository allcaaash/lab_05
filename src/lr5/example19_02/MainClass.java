package lr5.example19_02;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the start and end symbols.\nStart symbol: ");
        CharList.startChar = in.next().charAt(0);//I do not use a setter and getter about the task condition
        System.out.print("End symbol: ");
        CharList.endChar = in.next().charAt(0);

        System.out.println(CharList.onScreen());

        in.close();
    }
}
