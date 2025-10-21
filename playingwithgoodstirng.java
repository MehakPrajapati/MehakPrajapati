
import java.util.Scanner;

public class playingwithgoodstirng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
    }

    public static int longestsubstring(String s) {
        int ans = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isvowerls(ch)) {
                c++;
            } else {
                ans = Math.max(ans, c);
                return ans;
            }
        }
        ans = Math.max(ans, c);
        return ans;
    }

    public static boolean isvowerls(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
            return true;
        }
        return false;
    }
}
