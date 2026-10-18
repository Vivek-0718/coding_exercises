package Collection;

import java.util.HashMap;

public class anagramChecker {
    static HashMap createMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    static boolean checkAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return createMap(str1).equals(createMap(str2));
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("ac",null));
    }
}
