package classes_and_pointers;

import java.util.HashMap;
import java.util.Map;

public class Pointers {
    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();


        map1.put("value",11);
        map2=map1;

        System.out.println(map1);
        System.out.println(map2);

        map1.put("value",27);
        System.out.println("updated map"+map1);
        System.out.println("updated map"+map2);

    }
}
