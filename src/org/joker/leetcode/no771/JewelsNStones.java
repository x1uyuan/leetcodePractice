package org.joker.leetcode.no771;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-09 19:05
 */
public class JewelsNStones {
    /**
     * Runtime: 1 ms
     * Memory Usage: 36.8 MB
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        char[] Jarray = J.toCharArray();
        char[] Sarray = S.toCharArray();
        int result = 0;
        for (char c : Jarray) {
            for (char b : Sarray) {
                if (c == b) {
                    result++;
                }
            }
        }
        return result;
    }
}

