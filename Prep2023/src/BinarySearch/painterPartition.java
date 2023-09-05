package BinarySearch;

import java.util.Arrays;

public class painterPartition {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40};
        int N = 4; // no. of boards
        int M = 2; // no. of painters

        int sumOfArray = Arrays.stream(A).sum();

        int start = 0, end = sumOfArray, mid = 0, ans = 0;

        while(start<=end) {
            mid = start + (end - start)/2;

            if (isPossibleSolution(A, N, M, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            System.out.println("Possible solution - " + ans);
        }
        System.out.println("Final ans - " + ans);
    }

    static boolean isPossibleSolution(int A[], int N, int M, int mid) {
        int lengthPainted = 0, painterCount = 1;
        for (int i = 0; i<N; i++) {
            if (A[i] > mid) {
                return false;
            }
            if (lengthPainted + A[i] > mid) {
                lengthPainted = A[i];
                painterCount++;
                if (painterCount > M) {
                    return false;
                }
            } else {
                lengthPainted += A[i];
            }
        }
        return true;
    }
}
