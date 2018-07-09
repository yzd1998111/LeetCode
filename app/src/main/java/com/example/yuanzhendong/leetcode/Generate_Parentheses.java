package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Set<String> resSet = new HashSet<>();
        if (n == 0) {
            return result;
        } else if (n == 1) {
            result.add("()");
            return result;
        } else {
            generateParenthesisWrapper(resSet, "",0, 0, n);
            for (String entry : resSet) {
                result.add(entry);
            }
            return result;
        }
    }

    private void generateParenthesisWrapper(Set<String> resList, String res, int left, int right, int target) {
        if (res.length() == 2 * target && left == right) {
            resList.add(res);
            return ;
        } else if (res.length() > 2 * target) {
            return;
        } else {
            if (left > right) {
                generateParenthesisWrapper(resList, res + ")", left, right + 1, target);
                generateParenthesisWrapper(resList, res + "(", left+1, right, target);
            } else {
                generateParenthesisWrapper(resList, res + "(", left + 1, right, target);
            }
        }
    }
}
