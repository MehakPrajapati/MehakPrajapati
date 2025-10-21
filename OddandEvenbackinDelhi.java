import java.util.Scanner;

public class OddandEvenbackinDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of cars

        for (int i = 0; i < n; i++) {
            int carNumber = sc.nextInt();
            int evenSum = 0;
            int oddSum = 0;

            while (carNumber > 0) {
                int digit = carNumber % 10;

                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }

                carNumber /= 10;
            }

            if (oddSum % 3 == 0 || evenSum % 4 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
