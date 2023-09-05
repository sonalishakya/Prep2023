package Random;

import java.util.*;

/**
 * @author: sonali.shakya
 */

//Given an array and a target sum, to find a pair that adds up to the given sum. The array is always sorted.
//Input -
//        A = {1, 3, 5, 6, 7}    sum = 9
//Output -
//        {1, 3}

public class TwoSums {
    public static void main(String[] args) {

        int[] array = {1, 4, 6, 9, 9};
        int sum = 9;

        // brute force
        //      --  Nested looping
        //      --  O(n^2)
        System.out.println("Brute force - " + bruteForce(array, sum));

        // better approach
        //      -- Binary approach
        System.out.println("Binary search - " + binaryToFindPair(array, sum));

        // better approach
        System.out.println("Map approach - " + mapToFindPair(array, sum));
    }

    public static List<Integer> bruteForce(int[] array, int sum) {
        List<Integer> sumPair = new ArrayList<>();
        for (int i = 0; i <= array.length - 2; i++) {
            for (int j = i+1; j <= array.length - 1; j++) {
                if (array[i] + array[j] == sum) {
                    sumPair.add(array[i]);
                    sumPair.add(array[j]);
                    return sumPair;
                }
            }
        }
        return null;
    }

    public static List<Integer> binaryToFindPair(int[] array, int sum) {
        int low = 0;
        int high = array.length - 1;
        List<Integer> sumPair = new ArrayList<>();
        while(low < high) {
            if (array[low] + array[high] == sum) {
                sumPair.add(array[low]);
                sumPair.add(array[high]);
                return sumPair;
            } else if (array[low] + array[high] < sum) {
                return sumPair;
            } else {
                high--;
            }
        }
        return null;
    }

    public static boolean mapToFindPair(int[] array, int sum) {
        Set<Integer> compliment = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (compliment.contains(array[i]))
                return true;
            compliment.add(sum - array[i]);
        }
        return false;
    }
}
