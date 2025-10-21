import java.util.Scanner;

public class bostoncode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum1 = 0;

        // Step 1: Find sum of digits of the original number
        while (num > 0) {
            sum1 += num % 10;
            num = num / 10;
        }

        // Step 2: Find prime factors and sum of their digits
        int n = original;
        int sum2 = 0;

        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                int temp = i;
                while (temp > 0) {
                    sum2 += temp % 10;
                    temp = temp / 10;
                }
                n = n / i;
            }
        }

        // If any prime factor > (original), add its digits
        if (n > 1) {
            while (n > 0) {
                sum2 += n % 10;
                n = n / 10;
            }
        }

        // Step 3: Compare sums
        if (sum1 == sum2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

