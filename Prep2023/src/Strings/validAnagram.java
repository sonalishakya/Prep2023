package Strings;

import java.util.*;

/**
 * @author: sonali.shakya
 */
public class validAnagram {
    public static void main(String[] args)  {
        String s = "aacc";
        String t = "ccac";

        //O(n^2)
//        System.out.println(bruteForce(s, t));

//        System.out.println(hash(s, t));

        System.out.println(staticArray(s, t));
    }

    static boolean bruteForce(String s, String t) {
        boolean found = false;
        for (int i = 0; i < s.length()-1; i++) {
            found = false;
            for (int j = 0; j < t.length()-1; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    static boolean hash(String s, String t) {

        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(frequency.containsKey(s.charAt(i))) {
                int value = frequency.get(s.charAt(i));
                value++;
                frequency.put(s.charAt(i), value);
            } else
                frequency.put(s.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> m : frequency.entrySet()) {
            System.out.println(m);
        }

        for (int i = 0; i < t.length(); i++) {
            if (frequency.containsKey(t.charAt(i))) {
                int value = frequency.get(t.charAt(i));
                value--;
                if (value < 0) {
                    return false;
                }
                frequency.put(t.charAt(i), value);
            } else
                return false;
        }

        for (Map.Entry<Character, Integer> m : frequency.entrySet()) {
            System.out.println(m);
        }
        for (int i : frequency.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    static boolean staticArray(String s, String t) {
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, 0);

        for (int i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i)-97]++;
        }

        for (int i = 0; i < t.length(); i++) {
            alphabets[t.charAt(i)-97]--;
        }

        for (int i : alphabets) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
