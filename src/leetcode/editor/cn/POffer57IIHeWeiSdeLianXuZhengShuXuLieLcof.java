//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
// 👍 131 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java：和为s的连续正数序列
 * date：2020-07-29 14:05:28
 **/
public class POffer57IIHeWeiSdeLianXuZhengShuXuLieLcof {
    public static void main(String[] args) {
        Solution solution = new POffer57IIHeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
        // TO TEST
        int[][] out = solution.findContinuousSequence(10);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] findContinuousSequence(int target) {
            List<int[]> result = new ArrayList<>();
            int i = 1;

            while (target > 0) {
                target -= i++;
                if (target > 0 && target % i == 0) {
                    int[] array = new int[i];
                    for (int k = target / i, j = 0; k < target / i + i; k++, j++) {
                        array[j] = k;
                    }
                    result.add(array);
                }
            }
            Collections.reverse(result);
            return result.toArray(new int[0][]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
