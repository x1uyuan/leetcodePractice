//从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
//
// 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-tra
//versal/ 
// Related Topics 树 广度优先搜索 
// 👍 36 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：从上到下打印二叉树 II
 * date：2020-07-27 15:50:30
 **/
public class POffer32IICongShangDaoXiaDaYinErChaShuIiLcof {
    public static void main(String[] args) {
        Solution solution = new POffer32IICongShangDaoXiaDaYinErChaShuIiLcof().new Solution();
        // TO TEST
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
//        TreeNode d = new TreeNode(3);
//        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(15);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = f;
        c.right = g;
        List<List<Integer>> out = solution.levelOrder(a);
        for (int i = 0; i < out.size(); i++) {
            for (int j = 0; j < out.get(i).size(); j++) {
                System.out.print(out.get(i).get(j) + "\t");
            }
            System.out.println();
        }
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            levelOrder(root, res, 0);
            return res;
        }

        public void levelOrder(TreeNode root, List<List<Integer>> list, int level) {
            if (root == null) return;
            if (list.size() <= level) {
                List<Integer> lst = new ArrayList<>();
                list.add(lst);
            }
            list.get(level).add(root.val);
            levelOrder(root.left, list, level + 1);
            levelOrder(root.right, list, level + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
