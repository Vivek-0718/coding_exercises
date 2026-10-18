package Collection;

import java.util.*;

public class CountChars {
    static void charCounter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
    static void wordCounter(String str){
        Map<String, Integer> map = new HashMap<>();
        for (String c : str.toLowerCase().split(" ")) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }


    public static void main(String[] args) {
        charCounter("This is a great thing");
        wordCounter("This a is a great great thing");
    }
}
