package github.algorithmes.leetcode.algos.arrays;

public class MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDifference(int[] nums) {
        int max1 = nums[0]; // 1
        int max1Index = 0;
        int max2 = nums[1]; // 2
        int max2Index = 1;
        int min1 = nums[0]; // 3
        int min1Index = 0;
        int min2 = nums[1]; // 4
        int min2Index = 1;

        for (int num = 0; num < nums.length; num++) {
            if (nums[num] < min1 && nums[num] < min2) {
                if (min1 > min2) {
                    min1 = nums[num];
                    min1Index = num;
                } else {
                    min2 = nums[num];
                    min2Index = num;
                }
            }
            if (min1 > nums[num] && min2Index != num) {
                min1 = nums[num];
                min1Index = num;
            }
            if (min2 > nums[num] && min1Index != num) {
                min2 = nums[num];
                min2Index = num;
            }
        }

        for (int num = 0; num < nums.length; num++) {
            if (nums[num] > max1 && nums[num] > max2) {
                if (max1 > max2) {
                    max2 = nums[num];
                    max2Index = num;
                } else {
                    max1 = nums[num];
                    max1Index = num;
                }
            }
            if (max1 < nums[num] && max2Index != num) {
                max1 = nums[num];
                max1Index = num;
            }
            if (max2 < nums[num] && max1Index != num) {
                max2 = nums[num];
                max2Index = num;
            }
        }
        return max1 * max2 - min1 * min2;
    }
}
