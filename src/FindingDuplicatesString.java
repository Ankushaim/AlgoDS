import java.util.Arrays;

public class FindingDuplicatesString {
    void check(String s) {
        char[] string_arr = s.toCharArray();
        int[] heap_arr = new int[26];
        Arrays.fill(heap_arr, 0);
        for (char c : string_arr) {
            heap_arr[c - 97] += 1;
        }

        for (int i = 0; i < heap_arr.length; i++) {
            if(heap_arr[i] > 1)
            {
                System.out.println((char)(i + 97) + " count is " + heap_arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        String s = "finding";
        FindingDuplicatesString ob1 = new FindingDuplicatesString();
        ob1.check(s);
    }
}
