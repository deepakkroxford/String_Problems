public class equalto {
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2);
        /*
         * note
         * so when we use the equal to operator (==) so it check the adress value in the
         * memory so in our case s1 and s2 have the same memory when we check using this are
         * same or not so it provide the true as the output...
         */

        System.out.println(s1==s3);
        /*
         * when we check the s1==s3 so it give the false as the output because the address of the
         * s3 is diffrent form the s1 and s2 also.
         * becuse of the new keyword
         */

         // for that reason we have to avoide the use of the equal to operator
         // in the string..... insted of this we have to use the method

         System.out.println(s1.equals(s3));// and this give output as true
         

    }
}
