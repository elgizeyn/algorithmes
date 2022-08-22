package github.algorithmes.leetcode.algos.arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[0]) {
                return 0;
            } else if (nums.length == 1) {
                return 1;
            } else if (nums[nums.length - 1] < target && nums[nums.length - 2] < target) {
                return nums.length;
            } else if (nums[i] < target && i + 1 <= nums.length && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
