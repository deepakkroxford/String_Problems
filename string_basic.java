import java.util.Scanner;

class string_basic1 {
    /*
     * char is a primitive data type whereas String is a class in java. char
     * represents a single character whereas String can have zero or more
     * characters. So String is an array of chars. We define char in java program
     * using single quote (') whereas we can define String in Java using double
     * quotes (")
     */

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aman singh rathore";
        // System.out.println(str);

        String am = new String();
        // am= sc.next();
        // in next it only print the single word after any space it will not print
        // am = sc.nextLine();
        // it will print whole sentence
        System.out.println(str);
        // this is we used for printing the length of the string and it
        // is quite different from the array.
        // in string if we want to print the length we have to use () at the end of the
        // method
        System.out.println(str.length());
        String name = "Deepak kumar singh";
        // char ch = name.charAt(0);

        System.out.println(name.charAt(7));
        // so this will print the charcter that is present at index 7

        System.out.println(name.indexOf("e"));
        // so this will print the index value of e at first occurance

    }
}