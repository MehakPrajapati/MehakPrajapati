package CBCLASS;

import java.util.ArrayList;

public class heap {
    private ArrayList<Integer> ll = new ArrayList<>();

    public void add(int item) {
        ll.add(item);
        uppfiy(ll.size() - 1);
    }

    private void uppfiy(int ci) {
        int pi = (ci - 1) / 2;
        if (ll.get(pi) > ll.get(ci)) {
            swap(pi, ci);
            uppfiy(pi);
        }
    }

    public int remove() {
        swap(0, ll.size() - 1);
        int v = ll.size();

        downumpfiy(0);
        return v;
    }

    public void downumpfiy(int si) {
        int lci = 2 * si + 2;
        int rci = 2 * si * 2;
        int mini = si;

        if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
            mini = lci;
        }
        if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
            mini = rci;
        }

        if (mini != si) {
            swap(mini, si);
        }
    }

    private void swap(int ci, int pi) {
        int pih = ll.get(pi);
        int chh = ll.get(ci);
        ll.set(pi, chh);
        ll.set(ci, pih);
        int si = pi;
        if (ll.get(pi) > ll.get(ci)) {
            si = ci;
        }
        if (ll.get(si) > ll.get(ci)) {
            si = ci;

        }

    public int get() {
        return ll.get(0);
    }

    public int size() {
        return ll.size();
    }

    public void Display() {
        System.err.println(ll);
    }
}
