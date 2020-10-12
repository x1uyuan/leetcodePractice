//给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。 
//
// 
//
// 示例： 
//
// 输入：
//
//   1
//    \
//     3
//    /
//   2
//
//输出：
//1
//
//解释：
//最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
// 
//
// 
//
// 提示： 
//
// 
// 树中至少有 2 个节点。 
// 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/ 
//相同 
// 
// Related Topics 树 
// 👍 156 👎 0


package leetcode.editor.cn;
/**
* Java：二叉搜索树的最小绝对差
* date：2020-10-12 10:33:02
**/
public class P530MinimumAbsoluteDifferenceInBst{
    public static void main(String[] args) {
        Solution solution = new P530MinimumAbsoluteDifferenceInBst().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int val = Integer.MAX_VALUE;
    int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        postOrder(root);
        return res;
    }

    private void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        res = Math.min(Math.abs(node.val - val), res);
        val = node.val;
        postOrder(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
