package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findNumber {
    static int degreeOfArray(List<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        int maxOccur = -1;
        int sz = arr.size();
        int curOccur;
        int maxNum = arr.get(0);
        int firstIndex = 0;
        int lastIndex = 0;
        HashMap<Integer,Integer> tmpMap = new HashMap<>();
        for (int i = 0; i < sz; i++) {
            if (!tmpMap.containsKey(arr.get(i))) {
                tmpMap.put(arr.get(i), 1);
            } else {
                curOccur = tmpMap.get(arr.get(i)) + 1;
                tmpMap.put(arr.get(i), curOccur);
                if (curOccur > maxOccur) {
                    maxOccur = curOccur;
                    maxNum = arr.get(i);
                }
            }
        }
        for (int j = 0; j < sz; j++) {
            if (arr.get(j) == maxNum) {
                firstIndex = j;
                break;
            }
        }
        for (int k = sz - 1; k >= 0; k--) {
            if (arr.get(k) == maxNum) {
                lastIndex = k;
                break;
            }
        }

        return (lastIndex - firstIndex + 1);

    }

    static int getScore(String s) {
        if (s.isEmpty() || s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        } else {
            int curScore = 0;
            int maxScore = -1;
            int score1;
            int score2;
            for (int i = 0; i < s.length(); i ++) {
                score1 = getScoreWrapper(s, 0, i);
                score2 = getScoreWrapper(s, i, s.length());

                curScore = getScoreWrapper(s, 0, i) * getScoreWrapper(s, i, s.length());
                if (curScore > maxScore) {
                    maxScore = curScore;
                }
            }
            return maxScore;
        }
    }

    static int getScoreWrapper(String s, int start, int end) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        } else {
            return Integer.max(getScoreWrapper(s, start + 1, end), getScoreWrapper(s, start, end - 1));
        }
    }

    static void socialGraphs(List<Integer> counts) {
        List groupNums = new ArrayList();
        int curNum = 0;
        HashMap<String, Integer> tmpMap = new HashMap<>();

        for (int i = 0; i < counts.size(); i++) {
            if (groupNums.size() == 0) {
                groupNums.add(counts.get(i));
                curNum = counts.get(i);
            } else {
                if (curNum == counts.get(i)) {
                    curNum = curNum - 1;
                    if (curNum == 0) {
                        System.out.println(start + " " + end);
                    }
                } else {
                    groupNums.add(counts.get(i));
                }
            }
        }

    }

}
