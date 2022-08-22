package github.algorithmes.leetcode.algos.arrays;

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        int[] num = new int[nums.length];
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = 0; j <= i; j++)
                sum += nums[j];

            num[i] = sum;
        }
        return num;
    }
}
