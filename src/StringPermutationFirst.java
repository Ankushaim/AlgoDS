/*
* This method use recursion + back tracking + brute force method to find the permutation..
* with the help of recursion we will get back tracking and with this we will try brute force.
* Diagram or watching video again will help to understand the problem easily..
* */
import java.util.Arrays;

public class StringPermutationFirst {
    public StringPermutationFirst(int size) {
        a = new int[size];
        result = new char[size];
        Arrays.fill(a, 0);
    }
    static int[] a;
    static char[] result;

    void permutation(String s, int k) {
        if( k >=3)
        {
            for (int i = 0; i < k; i++) {
                System.out.print(result[i]);
            }
            System.out.println(" ");
        }
        else
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(a[i] == 0)
                {
                    result[k] = s.charAt(i);
                    a[i] = 1;
                    permutation(s, k + 1);
                    a[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        StringPermutationFirst ob1 = new StringPermutationFirst(s.length());
        ob1.permutation(s, 0);

    }
}
