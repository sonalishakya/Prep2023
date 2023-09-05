package Math;

import java.util.Arrays;

/**
 * @author: sonali.shakya
 */
public class SieveTheorem {
    public static void main(String[] args) {
        int target = 21;
        System.out.println(countPrime(target));

    }

    static int countPrime(int n) {
        boolean[] num = new boolean[n];
        Arrays.fill(num, true);
        int count = 0;

        for (int i = 2; i < num.length; i++) {
            if(num[i]) {
                for (int j = i*2; j < num.length; j+=i) {
                    num[j] = false;
                }
            }
        }

        for (int i = 2; i< num.length; i++) {
            if (num[i]) {
                count++;
            }
            System.out.println(i + " " + num[i]);
        }
        return count;
    }
}
