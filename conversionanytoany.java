import java.util.Scanner;

public class conversionanytoany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt(); // source base
        int db = sc.nextInt(); // destination base
        int sn = sc.nextInt(); // number in source base

        // Step 1: convert source number to decimal
        int decimal = 0;
        int power = 1;
        while (sn > 0) {
            int rem = sn % 10;
            decimal += rem * power;
            power *= sb;
            sn /= 10;
        }

        // Step 2: convert decimal to destination base
        int result = 0;
        int place = 1;
        while (decimal > 0) {
            int rem = decimal % db;
            result += rem * place;
            place *= 10;
            decimal /= db;
        }

        System.out.println(result);
    }
}
