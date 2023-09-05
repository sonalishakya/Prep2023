package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: sonali.shakya
 */
public class containsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1, 1, 2,3, 3, 2, 3, 4};

        //O(n^2)
//        System.out.println("Duplicates present - " + bruteForce(nums));

        //O(n) + memory space <= O(n)
        System.out.println("Duplicates present - " + singleTraverseSet(nums));

    }

    static boolean bruteForce(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean singleTraverseSet(int[] num) {
        if (num.length > 0) {
            Set<Integer> uniqueElement = new HashSet<>();
            for (int i : num) {
                if (uniqueElement.contains(i))
                    return true;
                else
                    uniqueElement.add(i);
            }
        }
        return false;
    }
}
