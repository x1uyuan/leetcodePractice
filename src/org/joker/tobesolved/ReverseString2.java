package org.joker.tobesolved;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-11 09:57
 */
public class ReverseString2 {
    /**
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        char[] sChar = s.toCharArray();

        if (k > sChar.length) {
            for (int i = 0; i < Math.floor(sChar.length / 2); i++) {
                char tmp = sChar[i];
                sChar[i] = sChar[sChar.length - i - 1];
                sChar[sChar.length - i - 1] = tmp;
            }
            return sChar.toString();
        } else {
            for (int i = 0; i < Math.floor(k / 2); i++) {
                char tmp = sChar[i];
                sChar[i] = sChar[k - i - 1];
                sChar[k - i - 1] = tmp;
            }
            return String.valueOf(sChar);
        }
    }

    public static void main(String[] args) {
        ReverseString2  rs2 = new ReverseString2();
        String input = "abcdefg";
        int k = 2;
        System.out.println(rs2.reverseStr(input,k));
    }

    }

