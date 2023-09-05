package Random;

/**
 * @author: sonali.shakya
 */

public class rotatedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 7;

        // Time - O(n)
        // Memory - O(n)
        // int[] ans = bruteForce(nums, k);


        // Time - O(n^2)
        // Memory - O(1)
        // int[] ans = bruteForceV2(nums, k);

        // Time - O(n)
        // Memory - O(1)
        int[] ans = reverseAlgo(nums, k);


        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    static int[] bruteForce(int[] num, int k) {
        int[] arr = new int[num.length];
        int j = 0;
        for (int i = num.length- k; i < num.length; i++) {
            arr[j++] = num[i];
        }
        for (int i = 0; i < num.length- k; i++) {
            arr[j++] = num[i];
        }
        return arr;
    }

    static int[] bruteForceV2(int[] num, int k) {
        int temp = 0;
        for (int i = num.length-1; i >= num.length - k; i--) {
            temp = num[num.length-1];
            for (int j = num.length-1; j >=0 ; j--) {
                if (j == 0) {
                    num[j] = temp;
                } else {
                    num[j] = num[j-1];
                }
            }
        }
        return num;
    }

    static int[] reverseAlgo(int[] num, int k) {
        //reverse whole
        reverse(num, 0, num.length-1);
        if (num.length < k)
            k = k - ((int)(k / num.length)) * num.length;
        //reverse till 0, k
        reverse(num, 0, k-1);
        //reverse k to num.length-1
        reverse(num, k, num.length-1);
        return num;
    }

    static int[] reverse(int[] num, int start, int end) {
        int temp = 0;
        while (start<=end) {
            temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        return num;
    }
}
