package github.algorithmes.leetcode.algos.strings;

import java.util.HashMap;

public class FindDifference {

    public static char findTheDifference(String s, String t) {
        if (s.isEmpty())
            return t.charAt(0);

        HashMap<Character, Integer> mapS = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!mapS.containsKey(c))
                mapS.put(c, 1);
            else
                mapS.put(c, mapS.get(c) + 1);
        }
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (!mapT.containsKey(c))
                mapT.put(c, 1);
            else
                mapT.put(c, mapT.get(c) + 1);
        }
        for (char i : mapS.keySet()) {
            if (!mapS.containsKey(i))
                return i;

            if (mapT.get(i) > mapS.get(i))
                return i;
        }
        return 'a';
    }
}
