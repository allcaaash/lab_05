package lr5.example19_02;

public class CharList {
    protected static char startChar;
    protected static char endChar;

    protected static String onScreen() {
        String result = "";

        if ((int)startChar > (int)endChar) {
            for (int i = (int)startChar; i >= (int)endChar; --i) {
                result += (char)i + " ";
            }
        }
        else{
            for (int i = (int)startChar; i <= (int)endChar; i++) {
                result += (char)i + " ";
            }
        }

        return result;
    }
}
