package github.algorithmes.leetcode.algos.arrays;

public class MaximumNumberOfWordsFoundISentences {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            String[] res = s.split(" ");
            if (res.length > max)
                max = res.length;
        }
        return max;
    }
}
