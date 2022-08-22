package github.algorithmes.leetcode.algos.math;

public class AddDigits {

    public int addDigits(int num) {
        int sum = 0;
        while (num / 10 >= 1) {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
