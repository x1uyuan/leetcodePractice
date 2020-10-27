//给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。例如，如果路径为 0 -> 1 -> 1 ->
// 0 -> 1，那么它表示二进制数 01101，也就是 13 。 
//
// 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。 
//
// 以 10^9 + 7 为模，返回这些数字之和。 
//
// 
//
// 示例： 
//
// 
//
// 输入：[1,0,1,0,1,0,1]
//输出：22
//解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
// 
//
// 
//
// 提示： 
//
// 
// 树中的结点数介于 1 和 1000 之间。 
// node.val 为 0 或 1 。 
// 
// Related Topics 树 
// 👍 77 👎 0


package leetcode.editor.cn;

/**
 * Java：从根到叶的二进制数之和
 * date：2020-10-27 15:03:52
 **/
public class P1022SumOfRootToLeafBinaryNumbers {
    public static void main(String[] args) {
        Solution solution = new P1022SumOfRootToLeafBinaryNumbers().new Solution();
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
        int res = 0;
        public int sumRootToLeaf(TreeNode root) {
            sumHelper(root, 0);
            return res;
        }

        private void sumHelper(TreeNode node, int sum) {
            int cSum = sum * 2 + node.val;
            if (node.left == null && node.right == null) res += cSum;
            else if (node.left == null) sumHelper(node.right, cSum);
            else if (node.right == null) sumHelper(node.left, cSum);
            else {
                sumHelper(node.left, cSum);
                sumHelper(node.right, cSum);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
