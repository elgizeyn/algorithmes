package github.algorithmes.leetcode.algos.strings;

public class DefiningAnIPAddress {

    public String defangIPaddr(String address) {

        String s = null;
        for (char c : address.toCharArray()) {
            if (c == '.') {
                s = address.replace(".", "[.]");
                break;
            }
        }
        return s;
    }
}
