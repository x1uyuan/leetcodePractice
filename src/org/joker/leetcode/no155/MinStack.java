package org.joker.leetcode.no155;

import java.util.Stack;

/**
 * 执行用时 :74 ms, 在所有 Java 提交中击败了98.49%的用户
 * 内存消耗 :40.3 MB, 在所有 Java 提交中击败了95.44%的用户
 *
 * @author wivtp
 * @description 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * @versin 1.0.0
 * @since 2019-07-04
 */
public class MinStack {
    private int size = 0;
    private Stack<Integer> stack;
    private Stack<Integer> minIndex;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minIndex = new Stack<>();
        minIndex.push(-1);
    }

    public void push(int x) {
        if (size == 0) {
            minIndex.push(0);
        } else {
            // push一个最小值
            if (stack.get(minIndex.peek()) > x) {
                minIndex.push(size);
            } else {
                minIndex.push(minIndex.peek());
            }
        }
        stack.push(x);
        size++;
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        minIndex.pop();
        stack.pop();
        size--;
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack.get(minIndex.peek());
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

