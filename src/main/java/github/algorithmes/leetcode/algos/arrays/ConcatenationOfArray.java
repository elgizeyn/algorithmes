package github.algorithmes.leetcode.algos.arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < result.length; i++) {
            int n = i % nums.length;
            result[i] = nums[n];
        }
        return result;
    }
}
