package org.joker;

/**
 * @author wivtp
 * @description 编写一个函数来查找字符串数组中的最长公共前缀。  如果不存在公共前缀，返回空字符串 ""。
 * @versin 1.0.0
 * @since 2019-07-02
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < minLength; j++) {
                if (strs[i].charAt(j) != strs[i].charAt(j)){
                    break;
                } else {
                    res += strs[i].charAt(j);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] input = {"flower","flow","flight"};
        System.out.println(lcp.longestCommonPrefix(input));
    }
}

