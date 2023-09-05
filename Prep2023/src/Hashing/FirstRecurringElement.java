package Hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class FirstRecurringElement {
    public static void main(String[] args) {
        int[] num = {-2, -2, 2, 4, 4};
        recurring(num);
    }

    static void recurring(int[] num) {
        List<Integer> existingElements = new ArrayList<>();
        if (num.length > 0) {
            for (int i : num) {
                if (existingElements.contains(i)) {
                    System.out.println(i);
                    return;
                }
                existingElements.add(i);
            }
        }
        System.out.println("Not found");
    }
}
