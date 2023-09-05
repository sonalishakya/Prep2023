package Random;

/**
 * @author: sonali.shakya
 */


//        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.

//        Example 1:
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]

//        Example 2:
//        Input: nums = [0]
//        Output: [0]

//        Constraints:
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1

public class moveZeros {
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};

        int[] numAns = movingZerosV2(num);
        for (int n : numAns) {
            System.out.println(n);
        }
    }

    static int[] movingZerosV2(int[] num) {
        int currentCount = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[currentCount] = num[i];
                currentCount++;
            }
        }
        while (currentCount < num.length) {
            num[currentCount] = 0;
            currentCount++;
        }
        return num;
    }
}
