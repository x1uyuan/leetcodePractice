//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最小深度 2. 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 337 👎 0


package leetcode.editor.cn;

/**
 * Java：二叉树的最小深度
 * date：2020-08-21 11:02:30
 **/
public class P111MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new P111MinimumDepthOfBinaryTree().new Solution();
        // TO TEST
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        System.out.println(solution.minDepth(a));
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
        public int minDepth(TreeNode root) {
            int[] res = new int[1];
            inOrder(root, 1, res);
            return res[0];
        }

        private void inOrder(TreeNode node, int depth, int[] res) {
            if (node == null) return;
            if (node.left == null && node.right == null) res[0] = res[0] == 0 ? depth : Math.min(depth, res[0]);
            inOrder(node.left, depth + 1, res);
            inOrder(node.right, depth + 1, res);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
