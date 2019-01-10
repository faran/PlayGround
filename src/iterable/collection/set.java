package iterable.collection;

import java.util.HashMap;
import java.util.Map;


public class set {

    public static void main(String[] args){

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(5,"five");
        map.put(7,"seven");
        map.put(6,"six");


//        String text = map.get(1);

//        System.out.println(text);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
