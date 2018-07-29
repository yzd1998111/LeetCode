package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagram {
    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int key = 1;
            for (char c : s.toCharArray()) {
                key *= prime[c - 'a'];
            }
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>(Arrays.asList(s)));
            } else {
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());

    }
}
