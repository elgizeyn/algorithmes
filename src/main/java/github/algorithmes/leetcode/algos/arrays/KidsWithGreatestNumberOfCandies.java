package github.algorithmes.leetcode.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            if (i > max)
                max = i;
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(i, true);
            } else
                res.add(i, false);
        }
        return res;
    }
}
