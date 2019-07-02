package org.joker.leetcode.no709;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-11 19:26
 */
public class ToLowerCase {
    /**
     * 执行用时：0 ms
     *
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        char[] tmp = str.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] <= 90 && tmp[i] >= 65) {
                tmp[i] += 32;
            }
        }
        return String.valueOf(tmp);
    }


    public static void main(String[] args) {
        ToLowerCase tlc = new ToLowerCase();
        String input = "PiTAs";
        System.out.println(tlc.toLowerCase(input));
    }
}

