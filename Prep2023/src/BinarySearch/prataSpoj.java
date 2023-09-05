package BinarySearch;

public class prataSpoj {
    public static void main(String[] args) {
        int[] cookRank = {4, 1, 2, 3, 4};
        int P = 10; //no of prata

        int maxRank = maxRank(cookRank);
        int start = 0, mid = 0, ans = 0;
        int end = maxTimeForMaxRank(maxRank, P);

        while (start<=end) {
            mid = start + (end - start)/2;
            if (isPossibleSolution(cookRank, P, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
       System.out.println("Final ans - " + ans);
    }

//    static boolean isPossibleSolution(int[] A, int P, int mid) {
//        System.out.println("mid - " + mid);
//        int cookCount = 1, totalTime = 0, totalPrata = 1;
//        for (int i = 1; i <= P; i++) {
//            if ((totalTime + A[cookCount]*totalPrata) > mid) {
//                cookCount++;
//                if (cookCount > A.length - 1) {
//                    return false;
//                }
//                totalPrata = 1;
//                totalTime = A[cookCount]*totalPrata;
//                System.out.println("Cook count - " + cookCount + " totalTime - " + totalTime  + " if");
//            } else {
//                totalTime += A[cookCount] * totalPrata;
//                totalPrata++;
//                System.out.println("Cook count - " + cookCount + " totalTime - " + totalTime + " else");
//            }
//        }
//        return true;
//    }


    static boolean isPossibleSolution(int[] A, int P, int mid) {
        int currentP = 0;
        for (int i = 1; i<A.length; i++) {
            int R = A[i], j = 1, timeTaken = 0;

            while (true) {
                if (timeTaken + j*R <= mid) {
                    ++currentP;
                    timeTaken += j*R;
                    j++;
                } else {
                    break;
                }
            }
            if (currentP >= P) {
                return true;
            }
        }
        return false;
    }
    static int maxTimeForMaxRank(int x, int P) {
        return (x * (P+1) * P) / 2;
    }

    static int maxRank(int[] A) {
        int max = A[1];
        for (int i = 2; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
}
