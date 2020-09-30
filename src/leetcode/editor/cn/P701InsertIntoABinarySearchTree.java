//给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据保证，新值和原始二叉搜索树中的任意节点值都不
//同。 
//
// 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回任意有效的结果。 
//
// 
//
// 例如, 
//
// 给定二叉搜索树:
//
//        4
//       / \
//      2   7
//     / \
//    1   3
//
//和 插入的值: 5
// 
//
// 你可以返回这个二叉搜索树: 
//
//          4
//       /   \
//      2     7
//     / \   /
//    1   3 5
// 
//
// 或者这个树也是有效的: 
//
//          5
//       /   \
//      2     7
//     / \   
//    1   3
//         \
//          4
// 
//
// 
//
// 提示： 
//
// 
// 给定的树上的节点数介于 0 和 10^4 之间 
// 每个节点都有一个唯一整数值，取值范围从 0 到 10^8 
// -10^8 <= val <= 10^8 
// 新值和原始二叉搜索树中的任意节点值都不同 
// 
// Related Topics 树 
// 👍 101 👎 0


package leetcode.editor.cn;

/**
 * Java：二叉搜索树中的插入操作
 * date：2020-09-30 09:26:43
 **/
public class P701InsertIntoABinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new P701InsertIntoABinarySearchTree().new Solution();
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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) return new TreeNode(val);
            else if (val < root.val && root.left == null) root.left = new TreeNode(val);
            else if (val > root.val && root.right == null) root.right = new TreeNode(val);
            else if (val < root.val) insertIntoBST(root.left, val);
            else insertIntoBST(root.right, val);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
