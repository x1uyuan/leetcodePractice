package org.joker.leetcode.no20;

import java.util.Stack;

/**
 * @author wivtp
 * @description 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 * @versin 1.0.0
 * @since 2019-07-02
 */
public class ValidBrackets {
    /**
     * 执行用时 :7 ms, 在所有 Java 提交中击败了50.97%的用户
     * 内存消耗 :34.9 MB, 在所有 Java 提交中击败了82.47%的用户
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if (((char)stack.peek() == '(' && s.charAt(i) == ')')
                    || ((char)stack.peek() == '[' && s.charAt(i) == ']')
                    || ((char)stack.peek() == '{' && s.charAt(i) == '}')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[]}";
        ValidBrackets vb = new ValidBrackets();
        System.out.println(vb.isValid(input));
    }
}

