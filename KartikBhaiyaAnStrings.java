package CBCLASS;

public class KartikBhaiyaAnStrings {
    public static void main(String[] args) {
        String str = "abaaaabababaaaa";
        int k = 2;
        int flipa = maximum(str, k, 'a');
        int flipb = maximum(str, k, 'a');
        System.out.println(Math.max(flipa, flipb));
    }

    public static int maximum(String str, int k, char ch) {
        int ei = 0;
        int si = 0;
        int flip = 0;
        int ans = 0;
        while (ei <= str.length()) {
            // grow
            if (str.charAt(ei) == ch) {
                flip++;
            }
            while (flip > k && si <= ei) {
                if (str.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }
            ans = Math.max(ans, ei - si + 1);
            ei++;

        }
        return ans;
    }
}
