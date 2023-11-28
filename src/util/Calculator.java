package util;

import java.util.HashSet;
import java.util.Arrays;

public class Calculator {
    public static String calculate(String text) {
        //Extract words from text
        String clearText = text.replaceAll("[.,!?:;-]", "");
        String[] words = clearText.split("\\s+");

        //Remove doublicates
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }

        //Sort
        String[] order = set.toArray(new String[0]);
        Arrays.sort(order, String.CASE_INSENSITIVE_ORDER);

        //Join
        String line = String.join(" ", order);
        
        return line;
    }
}
