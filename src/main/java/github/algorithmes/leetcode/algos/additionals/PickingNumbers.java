package github.algorithmes.leetcode.algos.additionals;

import lombok.var;

import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {
    public static void f1(List<Integer> a) {
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            List<Integer> iList = new ArrayList<>();
            iList.add(a.get(i));
            for (int j = 0; j < a.size(); j++) {
                if (i != j && Math.abs(a.get(i) - a.get(j)) <= 1) {
                    boolean f = true;
                    for (int k : iList) {
                        if (Math.abs(k - a.get(j)) > 1)
                            f = false;
                    }
                    if (f)
                        iList.add(a.get(j));
                }
            }
            list1.add(iList);
        }
        int max = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();
        for (var i : list1) {
            if (i.size() > max) {
                result = i;
                max = i.size();
            }
        }
        for (int i : result)
            System.out.println(i);

        System.out.println();
        System.out.println(result.size());
    }
}
