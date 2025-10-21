public class ArrayList_demo  
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>(); // 10 default
        System.out.println(ll);
        System.out.println(ll.size());
        // add
        ll.add(10);
        ll.add(20);

        ll.add(1, -2);

        // get
        System.out.println(ll.get(2));

        // remove
        System.out.println(ll.remove(1));
        System.out.println(ll);
        // update
        ll.set(1, -9);
        System.out.println(ll);
        ArrayList<Integer> lll = new ArrayList<>();
        lll.add(-9);
        lll.add(-2);
        for (int i = 0; i < lll.size(); i++) {
            System.out.println(ll.get(i) + "");
        }
        System.out.println();
    }
}