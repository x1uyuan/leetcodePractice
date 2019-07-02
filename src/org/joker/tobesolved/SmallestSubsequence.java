package org.joker.tobesolved;

import java.util.Stack;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-12 10:49
 */
public class SmallestSubsequence {
    public String smallestSubsequence(String S) {
//        String result = "";
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < text.length(); i++) {
//            map.put(text.charAt(i), 1);
//        }
//        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
//            result += entry.getKey();
//        }
//        return result;
        Stack<Integer> stack = new Stack<>();
        int[] last = new int[26];
        boolean[] seen = new boolean[26];
        for (int i = 0; i < S.length(); ++i) {
            last[S.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < S.length(); ++i) {
            int c = S.charAt(i) - 'a';
            if (seen[c]) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && i < last[stack.peek()]) {
                seen[stack.pop()] = false;
            }
            stack.push(c);
            seen[c] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : stack) {
            sb.append((char)('a' + i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SmallestSubsequence sss = new SmallestSubsequence();
        String input = "aabbccddabcdebgsdgtunjlpiwq";
        System.out.println(sss.smallestSubsequence(input));
    }
}

