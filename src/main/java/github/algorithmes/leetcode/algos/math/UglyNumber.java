package github.algorithmes.leetcode.algos.math;

public class UglyNumber {
    public boolean isUgly(int n) {
        if (n == 1)
            return true;
        if (n == 0)
            return false;

        int count = 0;
        while (n != 0) {
            count = 0;
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else if (n % 3 == 0) {
                n = n / 3;
                count++;
            } else if (n % 5 == 0) {
                n = n / 5;
                count++;
            } else if (n == 1) return true;
            if (count == 0) return false;
        }
        return true;
    }


    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                count += n / 2;
                n /= 2;
            }
            if (n % 2 == 1) {
                count += (n - 1) / 2;
                n -= (n - 1) / 2;
            }
        }
        return count;
    }
}
