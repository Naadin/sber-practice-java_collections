package org.example.map;
import java.util.HashMap;
import java.util.Map;

public class Map_Flipper {
    public static <K, V> Map<V, K> flipMap(Map<K, V> original) {
        Map<V, K> flipped = new HashMap<>();
        for (Map.Entry<K, V> entry : original.entrySet()) {
            flipped.put(entry.getValue(), entry.getKey());
        }
        return flipped;
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");

        System.out.println("Map: " + map);
        System.out.println("Обновленная Map: " + flipMap(map));
    }
}
