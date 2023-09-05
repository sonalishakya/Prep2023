package Strings;

import java.util.Arrays;

/**
 * @author: sonali.shakya
 */
public class longestCommonPrefix {
    public static void main(String args[]) {
        String[] s = {"flow", "flow", "flow"};

        System.out.println(bruteForce(s));
    }

    static String bruteForce(String[] s) {
        int k = 0;
        String ans = "";
        if (s.length != 0) {
            for (int i = 0; i < s[0].length(); i++) {
                    char prefix = s[0].charAt(k);
                    for (int j = 0; j < s.length; j++) {
                        if (k >= s[j].length() || s[j].charAt(i) != prefix) {
                            return ans;
                        }
                    }
                    ans = ans + prefix;
                    k++;
            }
        }
        return ans;
    }

//    static String prefixSingleLoop(String[] s) {
//        int k = 0;
//        String ans = "";
//        int min = findMin(s);
//
//        //sort
//        for (int i = 0; i < s[min].length()-1; i++) {
//            char prefix = s[min].charAt(k);
//            if (s[i].charAt(k) != prefix) {
//                return ans;
//            }
//            ans = ans + prefix;
//            k++;
//        }
//        return ans;
//    }
//
//    static int findMin(String[] a) {
//        int min = 0;
//        for (int i = 0; i < a.length-1; i++) {
//            if (a[i+1].length() < a[i].length()) {
//                min = i+1;
//            }
//        }
//        return min;
//    }
}
