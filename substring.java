public class substring {
    public static void main(String[] args) {
        String s = "codingbocks";
        System.out.println(s.substring(2, 6));
        System.out.println(s.subSequence(1, 1));
        String s1 = s.substring(2, 6);
        printsubstring(s);
    }

    public static void printsubstring(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.err.println(s.substring(i, j));
            }
        }
    }
}
