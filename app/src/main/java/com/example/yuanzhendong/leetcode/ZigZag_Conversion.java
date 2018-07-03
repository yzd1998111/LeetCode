package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ZigZag_Conversion {
    public static String convert(String s, int numRows) {
        System.out.println("abcaa");
        if (numRows == 0) {
            return "";
        } else if (numRows == 1) {
            return s;
        } else {
            ArrayList<Integer> indexArray = new ArrayList<>();
            ArrayList<Integer> tmpArray = new ArrayList<>();
            ArrayList<Integer> tmpArray2 = new ArrayList<>();

            int strLen = s.length();
            int curIndex = 0;
            int stepSize = (numRows-2) * 2 + 2;
            boolean first = true;
            while (indexArray.size() != strLen) {

                if (first) {
                    while (curIndex < strLen) {
                        indexArray.add(curIndex);
                        tmpArray.add(curIndex);
                        curIndex = curIndex + stepSize;
                    }
                    first = false;
                } else {
                    System.out.println("dd" + tmpArray);
                    while (!tmpArray.isEmpty()) {
                        int firstIdx = tmpArray.remove(0) + 1;
                        if (firstIdx < strLen) {
                            tmpArray2.add(firstIdx);
                        }
                        while (firstIdx < strLen  && (tmpArray.size() == 0 || firstIdx < tmpArray.get(0))) {
                            if (!indexArray.contains(firstIdx)) {
                                indexArray.add(firstIdx);
                            }
                            firstIdx = firstIdx + stepSize;
                            if (stepSize == 0) {
                                break;
                            }
                        }
                    }
                    System.out.println("adasdasd" + tmpArray2);
                    while (!tmpArray2.isEmpty()) {
                        tmpArray.add(tmpArray2.remove(0));
                    }
                }
                System.out.println("def" + indexArray.toString());
                stepSize = stepSize - 2;
            }
            System.out.println("ABC");
            StringBuilder res = new StringBuilder();
            while (!indexArray.isEmpty()) {
                res = res.append(s.charAt(indexArray.remove(0)));
            }
            return res.toString();
        }
    }
}
