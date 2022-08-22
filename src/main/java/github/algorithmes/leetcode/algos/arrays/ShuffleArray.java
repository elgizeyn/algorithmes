package github.algorithmes.leetcode.algos.arrays;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            y[i] = nums[i + n];
        }

        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = x[xCount];
                xCount++;
            } else {
                res[i] = y[yCount];
                yCount++;
            }
        }

        return res;
    }
}
