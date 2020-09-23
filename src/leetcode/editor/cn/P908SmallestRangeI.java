//给你一个整数数组 A，请你给数组中的每个元素 A[i] 都加上一个任意数字 x （-K <= x <= K），从而得到一个新数组 B 。 
//
// 返回数组 B 的最大值和最小值之间可能存在的最小差值。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：A = [1], K = 0
//输出：0
//解释：B = [1]
// 
//
// 示例 2： 
//
// 输入：A = [0,10], K = 2
//输出：6
//解释：B = [2,8]
// 
//
// 示例 3： 
//
// 输入：A = [1,3,6], K = 3
//输出：0
//解释：B = [3,3,3] 或 B = [4,4,4]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 0 <= K <= 10000 
// 
// Related Topics 数学 
// 👍 56 👎 0


package leetcode.editor.cn;

/**
 * Java：最小差值 I
 * date：2020-09-14 16:33:36
 **/
public class P908SmallestRangeI {
    public static void main(String[] args) {
        Solution solution = new P908SmallestRangeI().new Solution();
        // TO TEST
        System.out.println(solution.smallestRangeI(new int[]{1}, 0));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int smallestRangeI(int[] A, int K) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < A.length; i++) {
                if (A[i] < min) min = A[i];
                if (A[i] > max) max = A[i];
            }
            return min + Math.abs(K) < max - Math.abs(K) ? max - 2 * Math.abs(K) - min : 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
