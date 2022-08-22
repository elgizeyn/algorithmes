package github.algorithmes.leetcode.algos.strings;

import java.math.BigInteger;

public class AddStrings {
    public String addStrings(String num1, String num2) {

        BigInteger bigIntegerStr1, bigIntegerStr2, bigIntegerStr3;
        bigIntegerStr1 = new BigInteger(num1);
        bigIntegerStr2 = new BigInteger(num2);
        bigIntegerStr3 = bigIntegerStr1.add(bigIntegerStr2);
        return (bigIntegerStr3 + "");


    }
}
