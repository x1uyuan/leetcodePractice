package org.joker.leetcode.no58;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-12 13:16
 */
public class LengthOfLastWord {
    /**
     * 执行用时 :3 ms, 在所有Java提交中击败了61.01%的用户
     * 内存消耗 :34.8 MB, 在所有Java提交中击败了85.43%的用户
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if (s.length() == 0 || s == null){
            return 0;
        }
        String[] tmp = s.split(" ");
        if ( tmp.length > 0) {
            return tmp[tmp.length-1].length();
        }
        return 0;
    }


    public static void main(String[] args) {
        LengthOfLastWord lolw = new LengthOfLastWord();
        String input = "a ";
        System.out.println(lolw.lengthOfLastWord(input));
    }
}

