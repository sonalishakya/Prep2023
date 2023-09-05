package Random;

/**
 * @author: sonali.shakya
 */

// TODO: find the subarray with the largest sum

public class maxSubarray {
    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //bruteForce
        // creating all possible subarrays and checking till we find the maximum sum
//        System.out.println("Max sum - " + allPossibleSubArrays(num));

        System.out.println(kadaneAlgo(num));

    }

    static int allPossibleSubArrays(int[] num) {
        int max = num[0], sum = num[0];
        for (int i = 0 ; i < num.length; i++) {
            for (int j = i ; j < num.length; j++) {
                if (i == j) {
                    sum = num[i];
                } else {
                    System.out.println("i - " + i + " j - " + j);
                    sum = sum + num[j];
                    System.out.println("Number - " + num[j] + " Sum - " + sum);
                }
                max = Math.max(max, sum);
                //sum from num[i] to num[j]
                //check if greater than max ? set max = current_max
            }
            System.out.println("Max - " + max);
        }
        return max;
    }

    static int kadaneAlgo(int[] num) {
        int maxEndingHere = num[0];
        int maxSoFar = num[0];
        for (int i = 1 ; i < num.length ; i++) {
            System.out.println("maxEndingHere -> num[i] : " + num[i] + " maxEndingHere + num[i] : " + (maxEndingHere + num[i]));
            maxEndingHere = Math.max(num[i], maxEndingHere + num[i]);
            System.out.println("maxSoFar -> maxSoFar : " + maxSoFar + " maxEndingHere : " + maxEndingHere);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }




//    public static void main(String[] args) {
//        //Inputs
//        //{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] num = {1,2,-1,-2,2,1,-2,1,4,-5,4};
//        int sum = 0;
//        //validations
//            // 1 input array
//        if (hasOneElement(num)) {
//            sum = num[0];
//        } else {
//            // saving the maximum sum yet and moving in the array
//            // calculate sum from start to end
//            sum = maximumSum(num, sum);
//        }
//        System.out.println("Max sum is " + sum);
//
//    }
//
//    static boolean hasOneElement(int[] num) {
//        if (num.length == 1)
//            return true;
//        else
//            return false;
//    }
//
//    static int maximumSum(int[] num, int sum) {
//        int start = 0, end = num.length-1, subarraySum = 0, max = num[0];
//
//        while (start <= end) {
//            subarraySum = calculateSum(start, end, num, sum);
//            if (subarraySum > max) {
//                max = subarraySum;
//            }
//            if (num[start] < num[end]) {
//                start ++;
//            } else {
//                end--;
//            }
//        }
//        return max;
//    }
//
//    static int calculateSum(int start, int end, int[] num, int sum) {
//        int sumStart = 0, sumEnd = 0;
//        for (int i = 0; i <= num.length -1; i++) {
//            if (i < start) {
//                sumStart = sumStart + num[i];
//            } else if (i > end) {
//                sumEnd = sumEnd + num[i];
//            } else {
//                sum = sum + num[i];
//            }
//        }
//        System.out.println("SumS = " + sumStart + " SumM = " + sum + " SumE = " + sumEnd);
//        return sum;
//    }
}
