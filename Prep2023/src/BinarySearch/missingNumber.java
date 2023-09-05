package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class missingNumber {
    public static void main(String[] args) {
        int[] array = {2};
        int n = 1;

        System.out.println("Number - " + solveLinear(array, array.length));

    }

    static int solve(int[] array, int n) {
        int s = 0 ;
        int e = n - 1;
        int mid = (s+e)/2;
        int ans = -1;

        while(s<=e) {
            if ((mid+1) == array[mid]) {
                s = mid + 1;
            } else {
                ans = mid+1;
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    static int solveLinear(int[] array, int n) {
        int total = 0;
        for (int i = 0; i < n-1; i++) {
            total = array[i] ^ (i+1);
        }
        return total;

    }


}
