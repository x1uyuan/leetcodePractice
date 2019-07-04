package org.joker.leetcode.no171;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-04 12:39
 */
public class Title2Number {
    /**
     * 执行用时 :6 ms, 在所有 Java 提交中击败了84.75%的用户
     * 内存消耗 :35.9 MB, 在所有 Java 提交中击败了37.32%的用户
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int res = 0;
        char[] arr = s.toCharArray();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            res += (arr[i] - 64) * Math.pow(26, length - i - 1);
        }
        return res;
    }
}

