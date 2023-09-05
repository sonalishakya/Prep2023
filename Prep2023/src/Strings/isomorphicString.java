package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sonali.shakya
 */
public class isomorphicString {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

        System.out.println(checkIsomorphic(s, t));

    }

    static boolean checkIsomorphic(String s, String t) {
        Map<Character, Character> mappingEncryption = new HashMap<>();

        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (mappingEncryption.containsKey(s.charAt(i))) {
                    if (!mappingEncryption.get(s.charAt(i)).equals(t.charAt(i))) {
                        return false;
                    }
                } else {
                    if (mappingEncryption.containsValue(t.charAt(i))) {
                        return false;
                    }
                    mappingEncryption.put(s.charAt(i), t.charAt(i));
                }
            }
            return true;
        }
        return false;
    }
}
