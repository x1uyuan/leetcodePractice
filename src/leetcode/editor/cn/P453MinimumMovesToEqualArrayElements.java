//给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动将会使 n - 1 个元素增加 1。 
//
// 
//
// 示例: 
//
// 输入:
//[1,2,3]
//
//输出:
//3
//
//解释:
//只需要3次移动（注意每次移动会增加两个元素的值）：
//
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
// 
// Related Topics 数学 
// 👍 143 👎 0


package leetcode.editor.cn;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Java：最小移动次数使数组元素相等
 * date：2020-09-10 15:31:45
 **/
public class P453MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        Solution solution = new P453MinimumMovesToEqualArrayElements().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minMoves(int[] nums) {
            int min = Integer.MAX_VALUE;
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                min = Math.min(min, nums[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                res += (nums[i] - min);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
