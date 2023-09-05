package BinarySearch;

import java.util.Arrays;

public class bookAllocation {
    public static void main(String[] args) {
        int[] A = {12, 34, 69, 88};
        int N = 4, M = 2;
        int sum = Arrays.stream(A).sum();
        int start = 0, end = sum, mid = 0, ans = 0;

        while(start <= end) {
            mid = start + (end-start)/2;
            if (isPossibleSolution(A, N, M, mid)) {
                ans = mid;
                end = mid - 1;
                System.out.println("Possible Solutions - " + ans);
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Final answer - " + ans);
    }

    static boolean isPossibleSolution(int[] A, int N, int M, int mid) {
        int pageSum = 0, count = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] > mid) {
                return false;
            }
//            System.out.println("Count - " + count + " PageSum" + pageSum);
            if (pageSum + A[i] > mid) {
                pageSum = A[i];
                count++;
                if (count > M) {
                    return false;
                }
            } else {
                pageSum += A[i];
            }
        }
        return true;
    }
}
