package github.algorithmes.leetcode.algos.arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int x = target - nums[i]; //7
                if (nums[j] == x && j != i) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
