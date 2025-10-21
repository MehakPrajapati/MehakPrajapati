public class string {
    public static void main(String[] args) {
        String S1 = "hello";
        String S2 = new String("hello");
        // String S3 = "hello " + " bye";
        // Str1 = Str1 + "bye";
        // System.out.println("hello" + 10 + 20 + "nye");
        // System.out.println(10 + 20 + "hello ");
        // System.out.println("hello " + (10 + 20) + "bye");
        System.out.println(equals(S1, S2));

    }

    public static boolean equals(String S1, String S2) {
        if (S1 == S2) {
            return true;
        }
        if (S1.length() != S2.length()) {
            return false;
        }
        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
