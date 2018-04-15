package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

    public boolean isPalindromePermutation(String input) {
        int oddOccurences = 0;
        Map<Character, Integer> myChar = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (!myChar.containsKey(input.charAt(i))) {
                myChar.put(input.charAt(i), 1);
            } else {
                myChar.put(input.charAt(i), myChar.get(input.charAt(i))+1);
            }
        }
        for (Character key : myChar.keySet()) {
            if (myChar.get(key) % 2 != 0) {
                oddOccurences++;
            }
        }

        if (oddOccurences > 1) {
            return false;
        }
        return true;

    }
}
