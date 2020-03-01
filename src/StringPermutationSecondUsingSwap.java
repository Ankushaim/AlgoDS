public class StringPermutationSecondUsingSwap {

    void swap(int a, int b, char[] s)
    {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

    void permutation_swap(char[] s, int low, int high) {

        if (low == high)
        {
            for (int i = 0; i <= high; i++) {
                System.out.print(s[i]);
            }
            System.out.println(" ");
        }
        else
        {
            for (int i = low; i <= high; i++) {
                swap(low, i, s);
                permutation_swap(s,low + 1, high);
                swap(low, i, s);
            }
        }
    }

    public static void main(String[] args) {
        String s = "ABCD";
        char[] ss = s.toCharArray();
        StringPermutationSecondUsingSwap ob1 = new StringPermutationSecondUsingSwap();
        ob1.permutation_swap(ss,0, ss.length - 1);

    }
}
