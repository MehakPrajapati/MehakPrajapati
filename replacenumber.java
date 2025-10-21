
import java.util.Scanner;

public class replacenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int place = 1;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                rem = 5;
            }
            result = rem * place + result;
            place = place * 10;
            n = n / 10;
        }
        System.out.println(result);
    }
}
