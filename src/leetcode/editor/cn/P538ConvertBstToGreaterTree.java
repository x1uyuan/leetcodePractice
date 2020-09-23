//给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节
//点值之和。 
//
// 
//
// 例如： 
//
// 输入: 原始二叉搜索树:
//              5
//            /   \
//           2     13
//
//输出: 转换为累加树:
//             18
//            /   \
//          20     13
// 
//
// 
//
// 注意：本题和 1038: https://leetcode-cn.com/problems/binary-search-tree-to-greater-s
//um-tree/ 相同 
// Related Topics 树 
// 👍 344 👎 0


package leetcode.editor.cn;

/**
 * Java：把二叉搜索树转换为累加树
 * date：2020-09-21 10:13:19
 **/
public class P538ConvertBstToGreaterTree {
    public static void main(String[] args) {
        Solution solution = new P538ConvertBstToGreaterTree().new Solution();
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
        private int sum = 0;
        public TreeNode convertBST(TreeNode root) {
            inorder(root);
            return root;
        }

        private void inorder(TreeNode node) {
            if (node == null) return;
            inorder(node.right);
            node.val = node.val + sum;
            sum = node.val;
            inorder(node.left);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
