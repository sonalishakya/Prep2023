package BinarySearch;

public class KClosestElement {
    public static void main(String[] args) {
        int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};

        int k = 4;
        int x = 35;
        int l = 0, h = arr.length - 1;

        while (h-l >= k) {
            if ((x - arr[l]) >= (arr[h] - x)){
                l++;
            } else {
                h--;
            }
        }

        for (int i = l; i<=h; i++) {
            System.out.println(arr[i]);
        }


    }
}
