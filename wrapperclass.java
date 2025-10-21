public class wrapperclass {
    public static void main(String[] args) {
        int a = 9;
        Integer a1 = 9;
        Long l = 9l;
        System.out.println(l);
        System.out.println(a);
        System.out.println(a1);
        int i = a1; // on boxing
        Integer b = a; // autoboxcing
        Integer c1 = 191;
        Integer c2 = 191;
        System.out.println(c1 == c2);
        boolean b1 = false;
        boolean b2 = false;
        System.out.println(b2 == b1);

    }
}
