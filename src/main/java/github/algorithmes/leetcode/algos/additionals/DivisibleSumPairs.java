package github.algorithmes.leetcode.algos.additionals;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // 1,2 1,2    3,6    1,2  1,2
        int result = divisibleSumPair(list.size(), 5, list);
        System.out.println(result);
    }

    public static int divisibleSumPair(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && (ar.get(i) + ar.get(j)) % k == 0)
                    count++;
            }
        }
        return count;
    }
}
