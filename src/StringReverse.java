public class StringReverse {
    void reverse(String s) {
        char[] arr = new char[s.length()];
        for(int i = 0, j = (s.length() - 1); i < j; i++, j--) {
            if (i < j)
            {
                arr[j] = s.charAt(i);
                arr[i] = s.charAt(j);
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.printf(String.valueOf(arr[k]));
        }
    }

    public static void main(String[] args) {
        String s = "Ankush";
        StringReverse ob1 = new StringReverse();
        ob1.reverse(s);

    }
}
