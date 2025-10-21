package CBCLASS;

import java.util.PriorityQueue;

public class heap1 {
    public static void main(String[] args) {
        heap hp = new heap();
        hp.add(5);
        hp.add(2);
        hp.add(7);
        hp.add(3);
        hp.Display();
        PriorityQueue<Integer> pp = new PriorityQueue<>();
        pp.add(5);
        pp.add(8);
        pp.add(7);
        System.err.println(pp);

    }
}
