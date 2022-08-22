package github.algorithmes.leetcode.algos.arrays;

public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            res[i] = nums[k];
        }
        return res;
    }
}

// n! / ( n - r)!
