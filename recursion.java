public class recursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int f1 = fact(n - 1);
        return f1 = n;
    }
}