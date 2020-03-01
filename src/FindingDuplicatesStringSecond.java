/*
* This program will only for finding duplicates and can not count duplicates
* This method will work for both lower and upper case words...
*  */

public class FindingDuplicatesStringSecond {
   void bit_find(String s) {
       int x = 0, y = 0;
       for(int i = 0; i < s.length(); i++)
       {
           x = 1;
           x = x << s.charAt(i) - 97;
           if((x & y) > 0)
           {
               System.out.println(s.charAt(i) + " is duplicate");
           }
           else
           {
               y = x | y;
           }
       }

   }

    public static void main(String[] args) {
        String s = "fInding";
        FindingDuplicatesStringSecond ob1 = new FindingDuplicatesStringSecond();
        ob1.bit_find(s);
    }
}
