//给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。 
//
// 
//
// 示例 1： 
//
// 输入：
//    3
//   / \
//  9  20
//    /  \
//   15   7
//输出：[3, 14.5, 11]
//解释：
//第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
// 
//
// 
//
// 提示： 
//
// 
// 节点值的范围在32位有符号整数范围内。 
// 
// Related Topics 树 
// 👍 204 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：二叉树的层平均值
 * date：2020-10-30 11:04:20
 **/
public class P637AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        Solution solution = new P637AverageOfLevelsInBinaryTree().new Solution();
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
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> res = new ArrayList<>();
            if (root == null) return res;
            List<List<TreeNode>> lst = new ArrayList<>();
            List<TreeNode> list = new ArrayList<>();
            list.add(root);
            lst.add(list);
            int index = 0;
            while (index <= lst.size()) {
                List<TreeNode> tmp = new ArrayList<>();
                for (TreeNode node : lst.get(index)) {
                    if (node.left != null) tmp.add(node.left);
                    if (node.right != null) tmp.add(node.right);
                }
                if (tmp.size()!= 0) lst.add(tmp);
                index++;
            }
            for (List<TreeNode> a : lst) {
                double sum = 0;
                for (TreeNode b : a) {
                    sum += b.val;
                }
                res.add(sum / a.size());
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
