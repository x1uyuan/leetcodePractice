package org.joker.leetcode.no13;

/**
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 13:37
 */
public class Roman2Int {
    /**
     * 执行用时 :7 ms, 在所有 Java 提交中击败了99.56%的用户
     * 内存消耗 :36.3 MB, 在所有 Java 提交中击败了97.29%的用户
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int res = 0;
        int i = 0;
        for (; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    res += 4;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    res += 9;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    res += 40;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    res += 90;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    res += 400;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    res += 900;
                    i++;
                    continue;
                }
            }
            if (s.charAt(i) == 'I') {
                res += 1;
                continue;
            }
            if (s.charAt(i) == 'V') {
                res += 5;
                continue;
            }
            if (s.charAt(i) == 'X') {
                res += 10;
                continue;
            }
            if (s.charAt(i) == 'L') {
                res += 50;
                continue;
            }
            if (s.charAt(i) == 'C') {
                res += 100;
                continue;
            }
            if (s.charAt(i) == 'D') {
                res += 500;
                continue;
            }
            if (s.charAt(i) == 'M') {
                res += 1000;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Roman2Int r2i = new Roman2Int();
        String input = "III";
        System.out.println(r2i.romanToInt(input));
    }
}

