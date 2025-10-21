public class tree1 {
    public static void main(String[] args) {
        int n = 4;
        print(n, 0, "");
    }

    public static void print(int n, int current, String ans) {
        if (current == n) {
            System.out.println(ans);
            return;
        }
        if (current > n) {
            return;
        }
        // print(n, current + 1, ans + 1);
        // print(n, current + 2, ans + 2);
        // print(n, current + 3, ans + 3);

        for (int die = 1; die <= 3; die++) { // for max n
            print(n, current + die, ans + die);
        }

    }
}