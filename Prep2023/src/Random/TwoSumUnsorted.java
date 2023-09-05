package Random;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sonali.shakya
 */
public class TwoSumUnsorted {
    public static void main(String[] args) {
        int[] num = {3, 2, 4};
        int target = 6;
        int[] ans = new int[2];

//      validate
//          -- num for two entries -- O(1)
        ans = validate(num, target);

//      save compliments in a map
        Map<Integer, Integer> compliments = savingCompliments(num, target);

//      compare
        if (ans == null)
            ans = findingSum(num, compliments);

        if (ans[0] == -1) {
            System.out.println("Sum not found");
        } else {
            System.out.println("Sum found at " + ans[0] + ", " + ans[1]);
        }


    }

    static int[] validate(int[] num, int target){
        switch (num.length) {
            case 0 :
            case 1 : return new int[]{-1, -1};
            case 2 : {
                if (num[0] + num[1] == target)
                    return new int[]{0, 1};
                else
                    return new int[]{-1, -1};
            }
            default: return null;
        }
    }

    static Map<Integer, Integer> savingCompliments(int[] num, int target) {
        Map<Integer, Integer> compliments = new HashMap<>();
        for (int i  = 0; i < num.length; i++) {
            compliments.put(target - num[i], i);
        }
        return compliments;
    }

    static int[] findingSum(int[] num, Map<Integer, Integer> compliments) {
        for (int i = 0; i < num.length; i++) {
            if (compliments.containsKey(num[i]) && (compliments.get(num[i]) != i)) {
                return new int[]{i, compliments.get(num[i])};
            }
        }
        return new int[]{-1, -1};
    }
}
