class string_methods
{
    public static void main(String[] args) {
        String str = "Aman";
        String gtr = "Dipu";
        System.out.println(str.compareTo(gtr));
        /*
         * note:
         * so compareTo function return three values when we use
         * negative ,positive ,and zero
         * when the character is same it will give the output as zero
         * when the character is large it will print the positive value
         * when the character is small it will print the negative value 
         */


         //contains() method 

         String sent = "hi how are you";
         System.out.println(sent.contains("you"));
         /*
          * note: it only print the true and flase like bollean 
          so it work like it check the given string and if the given string is prensent 
          so it gives the output as true.. if not present it print the output as false
          */

          //endsWith() and startWith() method

          System.out.println(sent.endsWith("how")); //it give the output as false
          System.out.println(sent.startsWith("hii")); //it give the output as true 


          //toUpperCase() and toLowerCase()

          String ktr = " hahfhdsFfuEEEadhjksfuh";
          System.out.println(ktr.toUpperCase());
          System.out.println(ktr.toLowerCase());

          //concate() method
        
          String s1 = "aman";
          String s2 = "singh";
          System.out.println(s1.concat(" "+s2));
          /*
           * note
           * In this method it will add this two given string 
           */

           //Character.toString
           char c1 ='V';
           char c2 = 115;


           String x1,x2;
           x1 = Character.toString(c1);
           x2 = Character.toString(c2);
           System.out.println(x1);
           System.out.println(x2);


           //trim()  method 
           /*
            * this method is use to remove the all the leading and trailing spaces 
            form the original string 
            */

            String nontrimed = "    Deepak    "; // output ->Deepak
            System.out.println(nontrimed.trim());


            //SubStirng() method

            String withoutsubString = "Aman Singh";
            System.out.println(withoutsubString.substring(2));


            //replace() method

            String withoutrep = "mAmamn";
            System.out.println(withoutrep.replace('m', 'x'));
            System.out.println(withoutrep.replace("Ama", "aya"));

            //indexOf() method
 
            String q = "Amanaaa";
            System.out.println(q.indexOf("a",1));







    }
}