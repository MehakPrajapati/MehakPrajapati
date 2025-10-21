 import java.util.Scanner;
 public class printarmstrongnumberlast {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        printsArmstrongNumber(N1, N2);

        sc.close();
    }

    public static void printsArmstrongNumber(int N1, int N2) {
        for (int i = N1; i <= N2; i++) {
            int number = i;
            int counter = 0;

            // checking no. of digits
            int temp = number;
            while (temp > 0) {
                counter++;
                temp /= 10;
            }

            // main calculation logic
            int sum = 0;
            temp = number;

            while (temp > 0) {
                int remainder = temp % 10;
                sum = (int) (sum + Math.pow(remainder, counter));
                temp /= 10;
            }

            // checking arsmstrong or not
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}   

