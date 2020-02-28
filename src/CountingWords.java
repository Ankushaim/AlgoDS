public class CountingWords {

    public static void main(String[] args) {
        String s = "Hello Hi how are you";
        int words = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i-1) != ' ') {
                words++;
            }
        }
        System.out.println(words);
    }
}
