package com.example.yuanzhendong.leetcode;


/**
 * O(n**2) using center around approach
 */
public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        else if (s.length() == 1) {
            return s;
        } else {

            int strLen = s.length();
            int maxStrLen = 0;
            int curStrLen = -1;
            String maxStr = "";
            String curStr = "";
            for (int i = 0; i < strLen; i++) {
                curStr = longestPalindromeAround(i, s);
                if (curStr.length() > maxStrLen) {
                    maxStrLen = curStr.length();
                    maxStr = curStr;
                }
            }
            return maxStr;
        }
    }

    private String longestPalindromeAround(int index, String s) {
        //odd even
        int high = index + 1;
        int low = index;
        int oddEven = 0;
        while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            oddEven = oddEven + 2;
            low = low - 1;
            high = high + 1;
        }

        int seclow = index - 1;
        int sechigh = index + 1;
        int evenEven = 0;
        while(seclow >= 0 && sechigh < s.length() && s.charAt(seclow) == s.charAt(sechigh)) {
            evenEven = evenEven + 2;
            seclow = seclow - 1;
            sechigh = sechigh + 1;
        }
        if (oddEven > evenEven) {
            System.out.println("index" + index + " " + low + "," + high);
            return s.substring(low + 1,high );
        } else {
            System.out.println("bidex" + index + " " + seclow + "," + sechigh);
            return s.substring(seclow + 1, sechigh);
        }
    }
}
