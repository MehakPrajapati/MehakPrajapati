package CBCLASS;

import java.util.*;

public class hassmap {
    public static void main(String[] args) {
        TreeHashMap<String, Integer> map1 = new reeHashMap<>();
        map1.put("mmm");
        System.out.println(map1);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("hiiii", 78);
        hm.put("mapp", 76);
        hm.put("puneet", 33);
        hm.put("sip", 66);
        System.out.println(hm);
        System.out.println(hm.containsValue("raju"));
        System.out.println(hm.containsValue("monu"));
        System.out.println(hm.get("monu"));
        System.out.println(hm.remove("monu"));

        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("raj", 88);
        map2.put("sumit", 99);
        map2.put("mhk", 90);
        map2.put("rahul", 66);
        System.out.print(map2);
        key<String> set = map.keySet();
        System.out.println(key + " " + map.get(key));

        for  (String key : map.keySet() ) {
            System.out.println(key + " " + map.get()k;ey + " " + map.get());
        }
    }
}
