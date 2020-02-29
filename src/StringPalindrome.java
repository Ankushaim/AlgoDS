// We can also perform this by using temp array were we can store the reverse string and compare both the arrays

public class StringPalindrome {
    boolean palindrome(String s)
    {
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if(i < j)
            {
                if(s.charAt(i) != s.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abba";
        StringPalindrome ob1 = new StringPalindrome();
        boolean check = ob1.palindrome(s);
        if(check == true)
        System.out.printf("True");
        else
            System.out.printf("False");
    }
}
