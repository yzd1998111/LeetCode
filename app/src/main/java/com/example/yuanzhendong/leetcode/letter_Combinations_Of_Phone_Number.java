package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.List;

public class letter_Combinations_Of_Phone_Number {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits.length() == 0 || digits == " ") {
            return new ArrayList<>();
        } else {
            switch (digits.charAt(0)) {
                case '2':
                    res.add("a");
                    res.add("b");
                    res.add("c");
                    break;
                case '3':
                    res.add("d");
                    res.add("e");
                    res.add("f");
                    break;
                case '4':
                    res.add("g");
                    res.add("h");
                    res.add("i");
                    break;
                case '5':
                    res.add("j");
                    res.add("k");
                    res.add("l");
                    break;
                case '6':
                    res.add("m");
                    res.add("n");
                    res.add("o");
                    break;
                case '7':
                    res.add("p");
                    res.add("q");
                    res.add("r");
                    res.add("s");
                    break;
                case '8':
                    res.add("t");
                    res.add("u");
                    res.add("v");
                    break;
                case '9':
                    res.add("w");
                    res.add("x");
                    res.add("y");
                    res.add("z");
                    break;
            }
            if (digits.length() == 1) {
                return res;
            } else {
                List<String> finalList = new ArrayList<>();
                List<String> tmpList = letterCombinations(digits.substring(1, digits.length()));
                int tmpLen = tmpList.size();
                int resLen = res.size();
                for (int i = 0; i < resLen; i++) {
                    String curChar = res.get(i);
                    for (int j = 0; j < tmpLen; j++) {
                        finalList.add(curChar+tmpList.get(j));
                    }
                }
                return finalList;
            }
        }
    }
}
