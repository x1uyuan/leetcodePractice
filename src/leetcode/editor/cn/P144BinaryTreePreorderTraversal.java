//给定一个二叉树，返回它的 前序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [1,2,3]
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 401 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
* Java：二叉树的前序遍历
* date：2020-10-27 09:30:17
**/
public class P144BinaryTreePreorderTraversal{
    public static void main(String[] args) {
        Solution solution = new P144BinaryTreePreorderTraversal().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> lst = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        preorderHelper(root);
        return lst;
    }

    private void preorderHelper(TreeNode node) {
        if (node == null) return;
        lst.add(node.val);
        preorderHelper(node.left);
        preorderHelper(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
