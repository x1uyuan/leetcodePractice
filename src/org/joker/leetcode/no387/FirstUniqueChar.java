package org.joker.leetcode.no387;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-07-02 09:14
 */
public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        HashMap map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(s.charAt(i))) {
                map.put(c, 1);
            } else {
                int count = (int) map.get(c);
                map.replace(c, count, count + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if ((int) map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public int firstUniqChar_1(String s) {
        Map<Character, Integer> map = new HashMap<>(26);
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar_2(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar_3(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueChar fuc = new FirstUniqueChar();
        String input = "loveleetcode";
        System.out.println(fuc.firstUniqChar(input));
    }
}

