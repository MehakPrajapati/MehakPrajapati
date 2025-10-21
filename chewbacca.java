
import java.util.Scanner;
public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        changesNumber(n);

        sc.close();
    }

    public static void changesNumber(long n) {
        long reverse = 0;
        long counter = 0;

        //reversing
        while (n > 0) {
            long remainder = n % 10;
            reverse = reverse * 10  + remainder;
            counter++;
            n = n /10;
        }
        
        //looping the number
        long result = 0;
        for (long i = 0; i < counter; i++) {
            long remainder = reverse % 10;
            long digit = remainder;

            if (i == 0) {
                if (remainder != 9 && remainder > (9-remainder)) {
                    digit = 9 - remainder;
                    if (digit == 0) {
                        digit = remainder;
                    }
                }
            }else{
                if ((9 - remainder) < remainder) {
                    digit = 9 - remainder;
                }
            }
            result = result * 10 + digit;
            reverse = reverse / 10;
        }
        System.out.println(result);
    }
}
