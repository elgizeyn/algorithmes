package github.algorithmes.leetcode.algos.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }
        Set<Character> set = new HashSet<>();
        for (char i : map.keySet()) {
            if (map.get(i) == 1)
                set.add(i);

        }
        if (set.size() != 0)
            for (char c : s.toCharArray()) {
                if (set.contains(c))
                    return s.indexOf(c);
            }
        return -1;
    }
}
