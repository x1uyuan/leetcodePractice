//在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。 
//
// 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。 
//
// 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。 
//
// 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。 
//
// 
//
// 示例 1： 
// 
//
// 输入：root = [1,2,3,4], x = 4, y = 3
//输出：false
// 
//
// 示例 2： 
// 
//
// 输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
//输出：true
// 
//
// 示例 3： 
//
// 
//
// 输入：root = [1,2,3,null,4], x = 2, y = 3
//输出：false 
//
// 
//
// 提示： 
//
// 
// 二叉树的节点数介于 2 到 100 之间。 
// 每个节点的值都是唯一的、范围为 1 到 100 的整数。 
// 
//
// 
// Related Topics 树 广度优先搜索 
// 👍 99 👎 0


package leetcode.editor.cn;

/**
 * Java：二叉树的堂兄弟节点
 * date：2020-10-13 14:38:36
 **/
public class P993CousinsInBinaryTree {
    public static void main(String[] args) {
        Solution solution = new P993CousinsInBinaryTree().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            TreeNode xFather = getFather(root, x);
            TreeNode yFather = getFather(root, y);
            int xDepth = getDepth(root, x, 0);
            int yDepth = getDepth(root, y, 0);
            return xDepth == yDepth && !xFather.equals(yFather);
        }

        private TreeNode getFather(TreeNode node, int x) {
            if (node == null) return null;
            if (node.left != null && node.right != null) {
                if (node.left.val == x || node.right.val == x) return node;
                else if (getFather(node.left, x) != null) return getFather(node.left, x);
                if (getFather(node.right, x) != null) return getFather(node.right, x);
            } else if (node.left != null) {
                if (node.left.val == x) return node;
                else return getFather(node.left, x);
            } else if (node.right != null) {
                if (node.right.val == x) return node;
                else return getFather(node.right, x);
            }
            return null;
        }

        private int getDepth(TreeNode node, int val, int cDepth) {
            if (node == null) return -1;
            if (node.val == val) return cDepth;
            else if (node.left == null) {
                return getDepth(node.right, val, cDepth + 1);
            } else if (node.right == null) {
                return getDepth(node.left, val, cDepth + 1);
            } else {
                return Math.max(getDepth(node.right, val, cDepth + 1), getDepth(node.left, val, cDepth + 1));
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
