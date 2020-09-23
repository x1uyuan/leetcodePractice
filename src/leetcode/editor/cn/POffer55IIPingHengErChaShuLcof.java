//输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。 
//
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
//
// 限制： 
//
// 
// 1 <= 树的结点个数 <= 10000 
// 
//
// 注意：本题与主站 110 题相同：https://leetcode-cn.com/problems/balanced-binary-tree/ 
//
// 
// Related Topics 树 深度优先搜索 
// 👍 48 👎 0


package leetcode.editor.cn;

/**
 * Java：平衡二叉树
 * date：2020-07-28 16:46:23
 **/
public class POffer55IIPingHengErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new POffer55IIPingHengErChaShuLcof().new Solution();
        // TO TEST
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
//        TreeNode d = new TreeNode(3);
//        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(15);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = f;
        c.right = g;
        System.out.println(solution.isBalanced(a));
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        //        public boolean isBalanced(TreeNode root) {
//            return recur(root) != -1;
//        }
//
//        private int recur(TreeNode root) {
//            if (root == null) return 0;
//            int left = recur(root.left);
//            if (left == -1) return -1;
//            int right = recur(root.right);
//            if (right == -1) return -1;
//            return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
//        }
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            return isBalanced(root.left) && isBalanced(root.right) && (Math.abs(depth(root.left) - depth(root.right)) <= 1);
        }

        private int depth(TreeNode root) {
            return root == null ? 0 : (Math.max(depth(root.left), depth(root.right)) + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
