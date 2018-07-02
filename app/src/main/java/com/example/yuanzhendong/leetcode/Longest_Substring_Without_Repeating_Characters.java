package com.example.yuanzhendong.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * use hashmap for storing current characters seen.
 */
public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        if (s == null || s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        } else {
            Map<Character, Integer> charMap = new HashMap<>();
            int strLen = s.length();
            for (int i = 0; i < strLen; i++) {
                if (!charMap.containsKey(s.charAt(i))) {
                    charMap.put(s.charAt(i), i);
                } else {
                    i = charMap.get(s.charAt(i));
                    if (charMap.size() > maxLen) {
                        maxLen = charMap.size();
                    }
                    charMap = new HashMap<>();
                }
            }
            if (charMap.size() > maxLen) {
                maxLen = charMap.size();
            }
        }

        return maxLen;
    }
}
