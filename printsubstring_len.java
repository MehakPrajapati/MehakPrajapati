public class printsubstring_len {
    public static void main(String[] args) {
        String s = "coding blocks";
        pringsubstirng(s);
    }

    public static void pringsubstirng(String s) {
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                System.out.println(s.subSequence(i, j));
            }
        }

    }
}
