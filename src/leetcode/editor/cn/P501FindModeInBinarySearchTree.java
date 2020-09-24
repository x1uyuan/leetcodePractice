//给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。 
//
// 假定 BST 有如下定义： 
//
// 
// 结点左子树中所含结点的值小于等于当前结点的值 
// 结点右子树中所含结点的值大于等于当前结点的值 
// 左子树和右子树都是二叉搜索树 
// 
//
// 例如： 
//给定 BST [1,null,2,2], 
//
//    1
//    \
//     2
//    /
//   2
// 
//
// 返回[2]. 
//
// 提示：如果众数超过1个，不需考虑输出顺序 
//
// 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内） 
// Related Topics 树 
// 👍 178 👎 0


package leetcode.editor.cn;

import java.util.*;

/**
 * Java：二叉搜索树中的众数
 * date：2020-09-24 10:33:25
 **/
public class P501FindModeInBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new P501FindModeInBinarySearchTree().new Solution();
        // TO TEST
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        a.left = b;
        for (int i : solution.findMode(a)) System.out.println(i);
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
        private Map<Integer, Integer> map = new HashMap<>();
        public int[] findMode(TreeNode root) {
            if (root == null) return new int[0];
            inorderTraverse(root);
            Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o2) - map.get(o1);
                }
            });
            for (int i : map.keySet()) {
                pq.add(i);
            }
            int maxCount = 0;
            List<Integer> lst = new ArrayList<>();
            int vals = pq.remove();
            lst.add(vals);
            maxCount = map.get(vals);
            while (!pq.isEmpty()) {
                int tmp = pq.remove();
                if (maxCount == map.get(tmp)) lst.add(tmp);
                else break;
            }
            int size = lst.size();
            int[] res = new int[size];
            for (int i = 0; i < size; i++) {
                res[i] = lst.get(i);
            }
            return res;
        }

        private void inorderTraverse(TreeNode node) {
            if (node == null) return;
            inorderTraverse(node.left);
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            inorderTraverse(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
