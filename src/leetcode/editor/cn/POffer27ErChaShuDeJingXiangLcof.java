//请完成一个函数，输入一个二叉树，该函数输出它的镜像。 
//
// 例如输入： 
//
// 4 
// / \ 
// 2 7 
// / \ / \ 
//1 3 6 9 
//镜像输出： 
//
// 4 
// / \ 
// 7 2 
// / \ / \ 
//9 6 3 1 
//
// 
//
// 示例 1： 
//
// 输入：root = [4,2,7,1,3,6,9]
//输出：[4,7,2,9,6,3,1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 1000 
//
// 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/ 
// Related Topics 树 
// 👍 41 👎 0


package leetcode.editor.cn;

/**
 * Java：二叉树的镜像
 * date：2020-07-24 16:39:14
 **/
public class POffer27ErChaShuDeJingXiangLcof {
    public static void main(String[] args) {
        Solution solution = new POffer27ErChaShuDeJingXiangLcof().new Solution();
        // TO TEST
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        a.left = b;
        TreeNode out = solution.mirrorTree(a);
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
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) return root;
            if (root.left == null) {
                root.left = mirrorTree(root.right);
                root.right = null;
            }
            else if (root.right == null) {
                root.right = mirrorTree(root.left);
                root.left = null;
            } else {
                TreeNode tmp = root.left;
                root.left = mirrorTree(root.right);
                root.right = mirrorTree(tmp);
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
