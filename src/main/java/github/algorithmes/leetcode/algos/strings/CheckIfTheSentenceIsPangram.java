package github.algorithmes.leetcode.algos.strings;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        String alphabet = "thequickbrownfxjmpsvlazydg";
        for (char c : alphabet.toCharArray())
            if (!(sentence.contains("" + c))) return false;

        return true;
    }
}

