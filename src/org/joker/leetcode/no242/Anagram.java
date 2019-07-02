package org.joker.leetcode.no242;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-05-22 17:05
 */
public class Anagram {
    /**
     * 执行用时 : 10 ms, 在Valid Anagram的Java提交中击败了54.80% 的用户
     * 内存消耗 : 38.7 MB, 在Valid Anagram的Java提交中击败了86.94% 的用户
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }

        int[] letterCount = new int[256];
        for(int i=0; i< s.length(); i++) {
           letterCount[s.charAt(i)]++;
           letterCount[t.charAt(i)]--;
        }
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagram.isAnagram(s,t));
    }
}

