package github.algorithmes.leetcode.algos.arrays;

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i : nums) {
            int count = 0;
            while (i > 0) {
                i = i / 10;
                count++;
            }
            if (count % 2 == 0)
                res++;
        }
        return res;
    }
}
