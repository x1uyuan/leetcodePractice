package org.joker.leetcode.no344;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-11 00:36
 */
public class ReverseString {
    /**
     * Runtime: 2 ms, faster than 64.81% of Java online submissions for Reverse String.
     * Memory Usage: 47.1 MB, less than 79.50% of Java online submissions for Reverse String.
     *
     * @param s
     */
    public void reverseString(char[] s) {
        for (int i = 0; i < (s.length + 1) / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}

