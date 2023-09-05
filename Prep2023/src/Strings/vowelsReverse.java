package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class vowelsReverse {
    public static void main(String[] args) {
        String str = "Sonali";

//        List<Integer> vowel = populateVowelList();

        System.out.println(String.valueOf(reverseVowels(str)));
    }

//    static char[] stringToChar(String str) {
//        return str.toCharArray();
//    }
//    static List<Integer> populateVowelList() {
//        List<Integer> vowel = new ArrayList<>();
//        vowel.add((int)'a');
//        vowel.add((int)'e');
//        vowel.add((int)'i');
//        vowel.add((int)'o');
//        vowel.add((int)'u');
//        vowel.add((int)'A');
//        vowel.add((int)'E');
//        vowel.add((int)'I');
//        vowel.add((int)'O');
//        vowel.add((int)'U');
//
//        return vowel;
//    }

    static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    static char[] reverseVowels(String str) {
        char[] ch = str.toCharArray();
        int start = 0, end = str.length()-1;
        while (start <= end) {
            if (isVowel(ch[start]) && isVowel(ch[end])) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            } else {
                if (!isVowel(ch[start])) {
                    start++;
                }
                if (!isVowel(ch[end])) {
                    end--;
                }
            }
        }
        return ch;
    }

}
