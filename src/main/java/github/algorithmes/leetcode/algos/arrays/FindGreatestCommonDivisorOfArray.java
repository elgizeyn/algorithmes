package github.algorithmes.leetcode.algos.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums)
            list.add(i);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        int temp = 1;
        for (int i = 1; i <= min; i++) {
            if (i > temp && max % i == 0 && min % i == 0)
                temp = i;

        }
        return temp;
    }


}
