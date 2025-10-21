public class pattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < 3; i++) {
            int x = i * 2 * n + 1;
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(x);
                } else {
                    System.out.print(x + " * ");
                }
                x++;
            }

            System.out.println();
        }

        int x = 3 * n + 1;
        int y = x - 2 * n;
        for (int i = 3; i < 5; i++) {

            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(x);
                } else {
                    System.out.print(x + " * ");
                }
                x++;
            }
            x = y;
            System.out.println();
        }
    }
}
