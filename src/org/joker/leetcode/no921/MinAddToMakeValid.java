package org.joker.leetcode.no921;

import java.util.Stack;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-06-13 13:13
 */
public class MinAddToMakeValid {
    /**
     * 执行用时 :9 ms, 在所有Java提交中击败了34.88%的用户
     * 内存消耗 :34.7 MB, 在所有Java提交中击败了85.95%的用户
     * @param S
     * @return
     */
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty() && stack.peek()== '(' && S.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        MinAddToMakeValid matmv = new MinAddToMakeValid();
        String input = ")))()((";
        System.out.println(matmv.minAddToMakeValid(input));
    }
}

