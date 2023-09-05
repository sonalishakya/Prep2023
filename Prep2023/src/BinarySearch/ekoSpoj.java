package BinarySearch;

public class ekoSpoj {
    public static void main(String[] args) {
        int[] trees = {20, 10, 15, 17};

        int n = 4, target = 7;
        int maxTree = maxTree(trees);

        int start = 0, end = maxTree, mid, ans = 0;

        while (start<=end) {
            mid = start + (end-start)/2;
            if (isPossibleSolution(trees, mid, target)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            System.out.println("Possible solution - " + ans);
        }
        System.out.println("Final answer - " + ans);
    }

    static boolean isPossibleSolution(int[] trees, int mid, int target) {
        int sum = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > mid) {
                sum += (trees[i]-mid);
            }
        }
        System.out.println("mid - " +mid+ " Sum - " + sum);
        return sum >= target;
    }
    static int maxTree(int[] trees) {
        int max = trees[0];
        for (int i = 1; i < trees.length-2; i++) {
            if (trees[i] > max) {
                max = trees[i];
            }
        }
        return max;
    }
}
