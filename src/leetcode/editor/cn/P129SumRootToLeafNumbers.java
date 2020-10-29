//给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。 
//
// 例如，从根到叶子节点路径 1->2->3 代表数字 123。 
//
// 计算从根到叶子节点生成的所有数字之和。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//    1
//   / \
//  2   3
//输出: 25
//解释:
//从根到叶子节点路径 1->2 代表数字 12.
//从根到叶子节点路径 1->3 代表数字 13.
//因此，数字总和 = 12 + 13 = 25. 
//
// 示例 2: 
//
// 输入: [4,9,0,5,1]
//    4
//   / \
//  9   0
// / \
//5   1
//输出: 1026
//解释:
//从根到叶子节点路径 4->9->5 代表数字 495.
//从根到叶子节点路径 4->9->1 代表数字 491.
//从根到叶子节点路径 4->0 代表数字 40.
//因此，数字总和 = 495 + 491 + 40 = 1026. 
// Related Topics 树 深度优先搜索 
// 👍 226 👎 0


package leetcode.editor.cn;

/**
 * Java：求根到叶子节点数字之和
 * date：2020-10-29 09:24:23
 **/
public class P129SumRootToLeafNumbers {
    public static void main(String[] args) {
        Solution solution = new P129SumRootToLeafNumbers().new Solution();
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
        public int sumNumbers(TreeNode root) {
            sumHelper(root, 0);
            return sum;
        }

        private void sumHelper(TreeNode node, int val) {
            int tmp = val * 10 + node.val;
            if (node.left == null && node.right == null) {
                sum += tmp;
            } else if (node.left == null) {
                sumHelper(node.right, tmp);
            } else if (node.right == null) {
                sumHelper(node.left, tmp);
            } else {
                sumHelper(node.left, tmp);
                sumHelper(node.right, tmp);
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
