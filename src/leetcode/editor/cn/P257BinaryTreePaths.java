//给定一个二叉树，返回所有从根节点到叶子节点的路径。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3 
// Related Topics 树 深度优先搜索 
// 👍 345 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
* Java：二叉树的所有路径
* date：2020-09-04 15:12:15
**/
public class P257BinaryTreePaths{
    public static void main(String[] args) {
        Solution solution = new P257BinaryTreePaths().new Solution();
        // TO TEST
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.right = d;
        List<String> out = solution.binaryTreePaths(a);
        for (String s : out) {
            System.out.println(s);
        }
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
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return res;
        StringBuilder sb = new StringBuilder("" + root.val);
        preOrder(root, sb);
        return res;
    }

    private void preOrder(TreeNode root, StringBuilder sb) {

        if (root.left == null && root.right == null) res.add(sb.toString());
        else if (root.left == null) preOrder(root.right, sb.append("->" + root.right.val));
        else if (root.right == null) preOrder(root.left, sb.append("->" + root.left.val));
        else {
            StringBuilder sb1 = new StringBuilder(sb);
            preOrder(root.left, sb1.append("->" + root.left.val));
            preOrder(root.right, sb.append("->" + root.right.val));
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
