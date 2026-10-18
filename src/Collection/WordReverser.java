package Collection;

import java.util.List;

public class WordReverser {
    static String reverseWord(String sen) {
        if (sen == null) {
            return "INVALID";
        }
        StringBuilder result = new StringBuilder();
        for (String str : sen.split(" ")) {
            StringBuilder sb = new StringBuilder(str);
            result.append(sb.reverse()).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Hello World"));
        System.out.println(reverseWord(""));
        System.out.println(reverseWord(null));
    }
}
