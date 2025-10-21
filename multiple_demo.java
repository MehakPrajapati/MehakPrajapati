import java.util.*;

public class multiple_demo {
    public static void main(String[] args) {
        HashMap<String, Integer> set = new HashMap<>();
        set.add(1);
        set.add(2);
        System.out.print(set);
        // get
        System.out.println(set.containsValue(1));
        // remove
        System.out.println(set.remove(2));

        LinkedHashMap<String, Integer> set2 = new LinkedHashMap<>();
        set2.add(1);
        set2.add(3);
        System.out.print(set2);
        for(int x  =  set2){
System.out.println(x + " ");
        }
        int set1;
        for(int x  = set1){
            System.out.println(x + " ");
        }
    }
}