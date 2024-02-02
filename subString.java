public class subString {
    public static void main(String[] args) {
        String str = "abcde";
        //System.out.println(str.substring(0,4));
        /*
         * note:
         * The meaning of the substring is,it is the contigious part of 
         * the array or string.
         * In this method the last index is not not included. 
         */

         String s = "physics";
         for(int j=2;j<4;j++)
         {
            System.out.println(s.substring(j));

         }
         /*
          * output:
          ysics
          sics
          */

          String strg = "10212";
          for(int i=0;i<=strg.length();i++){
            for(int j=i+1;j<=strg.length();j++) //in this we use 4 because it is not counted
            {
                System.out.print(strg.substring(i, j)+" ");
            }
            System.out.println();
          }




    }
    
}
