package CBCLASS;

import java.util.Random;

public class randomno {
    public static void main(String[] args) {
        int low = 10;
        int high = 100;
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int val = rn.nextInt(high - low + 1) + low; // 10 - 100 randomm pic
            System.out.println(val);
        }
    }
}
