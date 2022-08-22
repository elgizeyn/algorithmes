package github.algorithmes.leetcode.algos.arrays;

public class BinarySearch {

    public int search(int[] nums, int target) {
        bubbleSort(nums);
        int start = 0;
        int last = nums.length - 1;
        int mid = (start + last) / 2;
        while (start <= last) {
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                last = mid - 1;
            else
                start = mid + 1;
            mid = (start + last) / 2;
        }
        return -1;

    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                int temp;
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
