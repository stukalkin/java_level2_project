package lesson3;

import java.util.*;

public class ArrayOfWords {
    public static void main(String[] args) {
        String line = "в лесу родилась елочка в лесу она росла зимой и летом стройная зеленая была метель ей пела песенку спи елочка бай бай мороз снежком укутывал смотри не замерзай";
        String[] oneArray = line.split(" ");
        arrayWords(oneArray);
        keyMap(oneArray);
    }

    public static void arrayWords(String[] s) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(s));
        System.out.println(set);
    }

    public static void keyMap(String[] a) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            int b = 1;
                if (map.containsKey(a[i])) {
                    map.put(a[i], ++b);
                } else {
                    map.put(a[i], b);
                }
        }
        System.out.println(map);
    }
}
