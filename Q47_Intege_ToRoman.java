class inttoroman {
    public static String intToRoman(int num) {
        int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String sym[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < value.length; i++) {
            if (num == 0) {
                break;
            }
            int times = num / value[i];
            while (times != 0) {
                sb.append(sym[i]);
                times--;
            }
            num = num % value[i];
        }
        return sb.toString();

        /*
         * Lets understand how each step working in this code
         * First step : we store the value in decending order in the interger array
         * Second step : we store the corresponding roman value in the string array
         * Third step : we create the new StringBuilder to store the roman value or we
         * can say that answer
         * 
         * ----* Now we start processing *-----
         * Step 4: we run the loop till length of the value array
         * Step 5: checking if the number == 0 then break the loop and return the string
         * .
         * Step 6: create a new varible with name times and divide by the value [i] and
         * this will give the
         * how many times the number is divided by the value and after getting this we
         * can append same number of
         * roman value into the answer
         * 
         * step 7 : run the while loop till the time reaches to zero and every time
         * decrese the the times and add the value
         * int the substring
         * 
         * after the while loop we have to do the module operation on the number
         * 
         * 
         * 
         */

    }

}

public class Q47_Intege_ToRoman {
    public static void main(String[] args) {
        /*
         * https://leetcode.com/problems/integer-to-roman/description/
         * 12. Integer to Roman
         * Medium
         * Seven different symbols represent Roman numerals with the following values:
         * Symbol Value
         * I 1
         * V 5
         * X 10
         * L 50
         * C 100
         * D 500
         * M 1000
         * Roman numerals are formed by appending the conversions of decimal place
         * values from highest to lowest. Converting a decimal place value into a Roman
         * numeral has the following rules:
         * 
         * If the value does not start with 4 or 9, select the symbol of the maximal
         * value that can be subtracted from the input, append that symbol to the
         * result, subtract its value, and convert the remainder to a Roman numeral.
         * If the value starts with 4 or 9 use the subtractive form representing one
         * symbol subtracted from the following symbol, for example, 4 is 1 (I) less
         * than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following
         * subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and
         * 900 (CM).
         * Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times
         * to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D)
         * multiple times. If you need to append a symbol 4 times use the subtractive
         * form.
         * Given an integer, convert it to a Roman numeral.
         * 
         * Example 1:
         * Input: num = 3749
         * 
         * Output: "MMMDCCXLIX"
         * 
         * Explanation:
         * 
         * 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
         * 700 = DCC as 500 (D) + 100 (C) + 100 (C)
         * 40 = XL as 10 (X) less of 50 (L)
         * 9 = IX as 1 (I) less of 10 (X)
         * Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on
         * decimal places
         * Example 2:
         * Input: num = 58
         * Output: "LVIII"
         * 
         * Explanation
         * 50 = L
         * 8 = VIII
         * 
         * Example 3:
         * Input: num = 1994
         * 
         * Output: "MCMXCIV"
         * 
         * Explanation:
         * 
         * 1000 = M
         * 900 = CM
         * 90 = XC
         * 4 = IV
         * Constraints
         * 1 <= num <= 3999
         */

        int num = 3749;
        System.out.println("num is " + num + " and it roman value is  " + inttoroman.intToRoman(num));

    }
}
