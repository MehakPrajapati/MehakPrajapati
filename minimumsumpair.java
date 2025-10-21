package CBCLASS;

import java.util.PriorityQueue;

public class minimumsumpair {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(minimum(arr));
    }

    public static int minimum(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int sum = 0;
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            sum += (a + b);
            pq.add(a + b);
        }
        return sum;
    }
}
