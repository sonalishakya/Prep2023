package Strings;

import java.util.Arrays;

/**
 * @author: sonali.shakya
 */
public class reverseOnlyLetter {
    public static void main(String[] args) {
        String s = "a-cd-ef-gh";
        char[] ch = s.toCharArray();
        System.out.println(String.valueOf(reverse(ch)));

    }

    static char[] reverse(char[] a) {
        int start = 0, end = a.length-1;

        while (start <= end) {
            if (start == end) {
                return a;
            } else {
                if (isInRange(a[start]) && isInRange(a[end])) {
                    swap(start, end, a);
                    start++;
                    end--;
                } else {
                    if (!isInRange(a[start])) {
                        start++;
                    }
                    if (!isInRange(a[end])) {
                        end--;
                    }
                }
            }
        }
        return a;
    }

    static boolean isInRange(char alphabet) {
        return (alphabet >= 97 && alphabet <= 122) || (alphabet >= 65 && alphabet <= 90);
    }

    static char[] swap(int a, int b, char[] arr) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }
}
