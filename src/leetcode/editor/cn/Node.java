package leetcode.editor.cn;

/**
 * @author t4nGk
 * @version 1.0.0
 * @since 2020/9/28 10:19 上午
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

