public class checkpalindrome {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(ispalindrome(s1));
    }

    public static boolean ispalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
