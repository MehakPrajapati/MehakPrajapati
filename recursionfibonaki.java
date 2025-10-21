public class recursionfibonaki {
    public static void main(String[] args) {
        int n = 5;
    }

    public static int fibonaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fibonaci(n - 1);
        int f2 = fibonaci(n - 1);
        return f1 + f2;
    }
}
