public class substring1 {
    public static void main(String[] args) {
        int n = 3;
        print(n, "");

    }

    public static void print(int n, String ans) {
        if (n == 0) {

            System.out.println(ans);

            return;
        }
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'h') {
            print(n - 1, ans + "h");
        }

        print(n - 1, ans + "t");

    }
}