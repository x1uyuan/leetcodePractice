//计算给定二叉树的所有左叶子之和。 
//
// 示例： 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24 
//
// 
// Related Topics 树 
// 👍 230 👎 0


package leetcode.editor.cn;

import com.sun.istack.NotNull;

/**
 * Java：左叶子之和
 * date：2020-09-21 17:06:44
 **/
public class P404SumOfLeftLeaves {
    public static void main(String[] args) {
        Solution solution = new P404SumOfLeftLeaves().new Solution();
        // TO TEST
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
        int sum = 0;

        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) return 0;
            helper(root);
            return sum;
        }

        private void helper(@NotNull TreeNode node) {
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) sum += node.left.val;
                else {
                    helper(node.left);
                }
            }
            if (node.right != null) {
                helper(node.right);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
