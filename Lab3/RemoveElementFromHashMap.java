package Lab3;

import java.util.HashMap;
import java.util.Map;

public class RemoveElementFromHashMap {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 10);
        hashMap.put("Key2", 20);
        hashMap.put("Key3", 30);
        hashMap.put("Key4", 40);

        System.out.println("HashMap before removal: " + hashMap);
        hashMap.remove("Key2");

        System.out.println("HashMap after removal: " + hashMap);
    }
}
