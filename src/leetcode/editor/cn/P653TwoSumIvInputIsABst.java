//给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。 
//
// 案例 1: 
//
// 
//输入: 
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 9
//
//输出: True
// 
//
// 
//
// 案例 2: 
//
// 
//输入: 
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 28
//
//输出: False
// 
//
// 
// Related Topics 树 
// 👍 153 👎 0


package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * Java：两数之和 IV - 输入 BST
 * date：2020-07-13 15:21:57
 **/
public class P653TwoSumIvInputIsABst {
    public static void main(String[] args) {
        Solution solution = new P653TwoSumIvInputIsABst().new Solution();
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        System.out.println(solution.findTarget(a, 28));
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
        public boolean findTarget(TreeNode root, int k) {
            HashSet<Integer> set = new HashSet<>();
            add2Set(set, root);
            for (Integer i : set) {
                if (set.contains(k - i) && k - root.val != root.val) {
                    return true;
                }
            }
            return false;
        }

        public void add2Set(Set<Integer> set, TreeNode node) {
            if (node != null) {
                set.add(node.val);
                add2Set(set, node.left);
                add2Set(set, node.right);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
