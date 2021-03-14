package algorithms;

/*
 * Given a string columnTitle(all capital letters) that represents
 * the column title as appear in an Excel sheet,
 * return its corresponding column number.
 * For example:
 * A -> 1
   B -> 2
   C -> 3
   ...
   Z -> 26
   AA -> 27
   AB -> 28
   ...
 */

public class ExcelSheetColumnNumber {

    private static int titleToNumber(String columnTitle) {
        int output = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            output = output * 26;
            output = output + columnTitle.charAt(i) - 'A' + 1;
        }

        return output;
    }

    public static void main(String[] args) {
        String columnTitle = "A";
        System.out.println(titleToNumber(columnTitle));

        columnTitle = "AB";
        System.out.println(titleToNumber(columnTitle));

        columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));

        columnTitle = "FXSHRXW";
        System.out.println(titleToNumber(columnTitle));
    }
}
