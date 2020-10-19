//在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。 
//
// 给你一个整数数组 arr，请你从中找出并返回一个幸运数。 
//
// 
// 如果数组中存在多个幸运数，只需返回 最大 的那个。 
// 如果数组中不含幸运数，则返回 -1 。 
// 
//
// 
//
// 示例 1： 
//
// 输入：arr = [2,2,3,4]
//输出：2
//解释：数组中唯一的幸运数是 2 ，因为数值 2 的出现频次也是 2 。
// 
//
// 示例 2： 
//
// 输入：arr = [1,2,2,3,3,3]
//输出：3
//解释：1、2 以及 3 都是幸运数，只需要返回其中最大的 3 。
// 
//
// 示例 3： 
//
// 输入：arr = [2,2,2,3,3]
//输出：-1
//解释：数组中不存在幸运数。
// 
//
// 示例 4： 
//
// 输入：arr = [5]
//输出：-1
// 
//
// 示例 5： 
//
// 输入：arr = [7,7,7,7,7,7,7]
//输出：7
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 500 
// 1 <= arr[i] <= 500 
// 
// Related Topics 数组 
// 👍 17 👎 0


package leetcode.editor.cn;

/**
 * Java：找出数组中的幸运数
 * date：2020-10-19 15:23:03
 **/
public class P1394FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        Solution solution = new P1394FindLuckyIntegerInAnArray().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findLucky(int[] arr) {
            int[] count = new int[500];
            for (int i : arr) count[i - 1] = count[i - 1] + 1;
            for (int i = 499; i >= 0; i--) if (count[i] == i + 1) return i + 1;
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
