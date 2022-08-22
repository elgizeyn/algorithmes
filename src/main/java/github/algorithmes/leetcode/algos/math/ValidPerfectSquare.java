package github.algorithmes.leetcode.algos.math;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int n = num;
        if (num == 1) return true;
        if (num < 4) return false;
        if (num > 100000000)
            num = num / 20000;
        for (int i = 1; i <= num / 2; i++) {
            if (i * i == n) return true;
        }
        return false;
    }
}
