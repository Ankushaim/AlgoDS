public class AnagramString {

    boolean anagram_check(String s, String t) {
        int[] hash_alpha = new int[26];
        if(s.length() != t.length())
        {
            System.out.println("Not Anagram");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            hash_alpha[index] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 97;
            if(hash_alpha[index] > 0)
            {
                hash_alpha[index] -= 1;
            }
            else
            {
                System.out.println("Not anagram");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "verbose";
        String t = "observe";
        AnagramString ob1 = new AnagramString();
        boolean check = ob1.anagram_check(s, t);
        if(check)
        {
            System.out.println("String is Anagram");
        }
    }
}
