package com.bilgeli.designpatterns.interviewThings.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringLength {
    public static HashMap<String, Integer> countRepeaterLetter(String s) {
        HashMap<String, Integer> keyValuePair = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);

            if (keyValuePair.containsKey(substring)) {
                keyValuePair.put(substring, keyValuePair.get(substring) + 1);
            } else {
                keyValuePair.put(substring, 1);
            }

        }
        return keyValuePair;
    }

    public static HashMap<Character, Integer> countRepeaterLetterBetterVersion(String s) {
        HashMap<Character, Integer> keyValuePair = new HashMap<>();

        for (char c : s.toCharArray()) {
            keyValuePair.put(c, keyValuePair.getOrDefault(c, 0) + 1);
        }
        return keyValuePair;
    }

    public static void main(String[] args) {
        String deger = "biiisaass";
        HashMap<String, Integer> stringIntegerHashMap = countRepeaterLetter(deger);
        HashMap<Character, Integer> characterIntegerHashMap = countRepeaterLetterBetterVersion(deger);
        System.out.println(stringIntegerHashMap);
        System.out.println(characterIntegerHashMap);

    }
}
