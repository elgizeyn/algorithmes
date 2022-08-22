package github.algorithmes.leetcode.algos.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {

    public static String[] findWords(String[] words) {
        List<Character> firstRow = new ArrayList<>();
        firstRow.add('q');
        firstRow.add('w');
        firstRow.add('e');
        firstRow.add('r');
        firstRow.add('t');
        firstRow.add('y');
        firstRow.add('u');
        firstRow.add('i');
        firstRow.add('o');
        firstRow.add('p');

        List<Character> secondRow = new ArrayList<>();
        secondRow.add('a');
        secondRow.add('s');
        secondRow.add('d');
        secondRow.add('f');
        secondRow.add('g');
        secondRow.add('h');
        secondRow.add('j');
        secondRow.add('k');
        secondRow.add('l');


        List<Character> thirdRow = new ArrayList<>();
        thirdRow.add('z');
        thirdRow.add('x');
        thirdRow.add('c');
        thirdRow.add('v');
        thirdRow.add('b');
        thirdRow.add('n');
        thirdRow.add('m');

        List<String> res = new ArrayList<>();

        for (String word : words) {
            String lowerWordCase = word.toLowerCase();
            Set<String> result = new HashSet<>();
            for (char c : lowerWordCase.toCharArray()) {
                if (firstRow.contains(c))
                    result.add("1");
                else if (secondRow.contains(c))
                    result.add("2");
                else if (thirdRow.contains(c))
                    result.add("3");
            }
            if (result.contains("1") && (!result.contains("2")) && (!result.contains("3"))) {
                res.add(word);
            }
            if (!(result.contains("1")) && result.contains("2") && (!result.contains("3"))) {
                res.add(word);
            }
            if (!(result.contains("1")) && (!result.contains("2")) && result.contains("3")) {
                res.add(word);
            }
        }
        String[] strings = new String[res.size()];
        for (int i = 0; i < strings.length; i++)
            strings[i] = res.get(i);

        return strings;
    }
}
