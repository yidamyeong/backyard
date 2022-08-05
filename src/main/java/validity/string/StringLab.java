package validity.string;

import java.util.Arrays;

public class StringLab {

    private final String none = null;
    private final String empty = "";
    private final String whitespace = "   ";
    private final String line = "---------------------------------------";

    public static void main(String[] args) {
        StringLab lab = new StringLab();

        lab.testIsEmpty();

        lab.testTrim();

        lab.testSplit();
    }

    private void testIsEmpty() {
        // isEmpty()는 length 만 따지므로 whitespace 는 empty 라고 인식하지 않는다.
        // isBlank()는 whitespace 도 blank 하다고 본다. (java 11부터)

        try {
            System.out.println(none.isEmpty());  // NPE 발생
        } catch (Exception e) {
            showNpeWarning("isEmpty()", none);
        }
        System.out.println(empty.isEmpty());  // true
        System.out.println(whitespace.isEmpty());  // false
        System.out.println(line);
    }

    private void testTrim() {
        // trim()은 문자열의 앞,뒤 여백만 제거한다.
        String wordIncludeSpace = "  S T  R I NG  ";
        showTrimTemplate(wordIncludeSpace);
        showTrimTemplate(none);
        showTrimTemplate(empty);
        showTrimTemplate(whitespace);
    }

    private void showTrimTemplate(String testStr) {
        try {
            System.out.printf("Before trim() => [%s] (%d)\n", testStr, testStr.length());
            System.out.printf("After trim() => [%s] (%d)\n", testStr.trim(), testStr.trim().length());
            System.out.println(line);
        } catch (NullPointerException e) {
            showNpeWarning("trim()", testStr);
        }
    }

    private void showNpeWarning(String methodName, Object parameter) {
        System.out.println("NullPointerException Occurred while executing " + methodName);
        System.out.println("Causing parameter: " + parameter);
        System.out.println(line);
    }

    private void testSplit() {
        // 문자열에 포함되지 않는 구분자로 나눌 때
        String str = "423";
        String[] strs = str.split(",");
        System.out.println(Arrays.toString(strs));
    }

}
