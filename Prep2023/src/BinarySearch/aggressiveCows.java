package BinarySearch;

public class aggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {10, 1, 2, 7, 5};
        int n = 5;
        int k = 3;

        int[] sortedStalls = sort(stalls);

        int start = 0, end = sortedStalls[sortedStalls.length-1] - sortedStalls[0], mid = 0, ans = 0;

        while (start <= end) {
            mid = (start+end)/2;
            if(isPossibleSolution(sortedStalls, n, k, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Final ans - " + ans);
    }

    public static boolean isPossibleSolution(int[] stalls, int n, int k, int mid) {
        int cowCount = 1, pos = stalls[0];
        for (int i = 0; i < n; i++) {
            if (stalls[i] - pos >= mid) {
                cowCount++;
                pos = stalls[i];
            }
            if (cowCount == k) {
                return true;
            }
        }
        return false;
    }
    static int[] sort(int[] A) {
        int d1, d2, temp;
        for (int i = 0; i < A.length-1; i++) {
            d1 = A[i];
            d2 = A[i+1];

            if (d2<d1) {
                temp = A[i+1];
                A[i+1] = A[i];
                A[i] = temp;
                i = -1;
            }
        }
        return A;
    }

}
