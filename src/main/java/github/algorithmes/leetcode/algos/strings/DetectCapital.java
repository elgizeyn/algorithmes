package github.algorithmes.leetcode.algos.strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if (word.length() == 1)
            return true;

        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))) {
                for (int j = 2; j <= word.length() - 1; j++) {
                    if (Character.isLowerCase(word.charAt(j)))
                        return false;
                }
                return true;
            }

            for (int j = 1; j <= word.length() - 1; j++) {
                if (Character.isUpperCase(word.charAt(j)))
                    return false;
            }
            return true;
        }
        if (Character.isLowerCase(word.charAt(0))) {
            for (int j = 1; j <= word.length() - 1; j++) {
                if (Character.isUpperCase(word.charAt(j)))
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);

        String startDate = "20220421";
        String endDate = "20220422";

        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.BASIC_ISO_DATE);

        LocalDate maxDate = start.plusDays(31);


        if (end.getYear() == year && start.getYear() == year) {
            System.out.println(1);
            if (!end.isAfter(maxDate)) {
                System.out.println(startDate);
                System.out.println(maxDate);
                System.out.println(end);
            }

        } else
            System.out.println("must be in the same year");
    }
}


