package github.algorithmes.leetcode.algos.arrays;

public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            if (s.contains("+"))
                x++;
            else x--;
        }
        return x;
    }
}
