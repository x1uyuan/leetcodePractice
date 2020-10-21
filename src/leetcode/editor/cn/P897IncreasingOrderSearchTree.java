//给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。 
//
// 
//
// 示例 ： 
//
// 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
//
//       5
//      / \
//    3    6
//   / \    \
//  2   4    8
// /        / \ 
//1        7   9
//
//输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
//
// 1
//  \
//   2
//    \
//     3
//      \
//       4
//        \
//         5
//          \
//           6
//            \
//             7
//              \
//               8
//                \
//                 9  
//
// 
//
// 提示： 
//
// 
// 给定树中的结点数介于 1 和 100 之间。 
// 每个结点都有一个从 0 到 1000 范围内的唯一整数值。 
// 
// Related Topics 树 深度优先搜索 
// 👍 111 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：递增顺序查找树
 * date：2020-10-21 16:12:08
 **/
public class P897IncreasingOrderSearchTree {
    public static void main(String[] args) {
        Solution solution = new P897IncreasingOrderSearchTree().new Solution();
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
        List<TreeNode> preOrderNodes = new ArrayList<>();

        public TreeNode increasingBST(TreeNode root) {
            preOrder(root);
            int size = preOrderNodes.size();
            for (int i = 0; i < size - 1; i++) {
                preOrderNodes.get(i).left = null;
                preOrderNodes.get(i).right = preOrderNodes.get(i + 1);
            }
            preOrderNodes.get(size - 1).left = null;
            preOrderNodes.get(size - 1).right = null;
            return preOrderNodes.get(0);
        }

        private void preOrder(TreeNode node) {
            if (node == null) return;
            preOrder(node.left);
            preOrderNodes.add(node);
            preOrder(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
