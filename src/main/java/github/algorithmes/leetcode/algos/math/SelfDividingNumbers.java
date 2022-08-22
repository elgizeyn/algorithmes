package github.algorithmes.leetcode.algos.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
//            int n = i;
            int k = i;
            int count = 0;
            int count2 = 0;
            while (k > 0) {
                if ((k % 10 != 0) && (i % (k % 10) == 0)) {
                    count++;
                }
                k /= 10;
                count2++;
            }
            if (count == count2)
                list.add(i);
        }
        return list;
    }
}
