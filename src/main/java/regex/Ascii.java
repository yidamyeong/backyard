package regex;

import java.util.regex.Pattern;

public class Ascii {

    public static void main(String[] args) {
        String str = "";
        Ascii ascii = new Ascii();

        System.out.println(ascii.isAsciiPattern(str));
    }

    public boolean isAsciiPattern(String str) {
        String regex = "[\\x00-\\x7F]+$";
        return Pattern.matches(regex, str);
    }

}
