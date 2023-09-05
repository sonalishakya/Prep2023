package Random;

/**
 * @author: sonali.shakya
 */
public class peakElement {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};

        // O(n)
//        int ans = bruteForce(num);

        int ans = binarySearch(num);

//        int ans = oldSolution(num);
        System.out.println(ans == -1 ? "Not found" : num[ans]);

    }

    static int bruteForce(int[] num) {
        for (int i = 0; i < num.length-2; i++ ) {
            if (num[i] < num[i+1] && num[i+1] > num[i+2]) {
                return i+1;
            }
        }
        if (num[0] > num[1]) {
            return 0;
        }
        if (num[num.length-1] > num[num.length-2]) {
            return num.length-1;
        }
        return -1;
    }

    static int binarySearch(int[] num) {
        int start = 0, end = num.length - 1, mid = 0;
        
        if (start == end) {
            return start;
        } else {
            while (start<=end) {
                mid = start + (end-start)/2;
                if (start == end)
                    return start;
                else if (mid == num.length-1)
                    return num.length-1;
                else if (start == end-1) {
                    if (num[start] > num[end])
                        return start;
                    else
                        return end;
                } else {
                    if (num[mid] > num[mid-1] && num[mid] > num[mid+1])
                        return mid;
                    else if (num[mid] > num[mid-1] && num[mid] < num[mid+1])
                        start = mid + 1;
                    else
                        end = mid;
                }
            }
        }
        return -1;
    }


    static int oldSolution(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;
        if (start==end) {
            return start;
        } else if (start == end-1) {
            if (nums[start]>nums[end]) {
                return start;
            } else {
                return end;
            }
        } else {
            while (end>=start) {
                mid = (start+end)/2;
                if (nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) {
                    return mid;
                } else if (nums[mid] > nums[mid+1]) {
                    end = mid-1;
                } else if (nums[mid] > nums[mid-1]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
