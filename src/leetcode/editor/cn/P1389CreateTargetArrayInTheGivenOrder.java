//给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组： 
//
// 
// 目标数组 target 最初为空。 
// 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。 
// 重复上一步，直到在 nums 和 index 中都没有要读取的元素。 
// 
//
// 请你返回目标数组。 
//
// 题目保证数字插入位置总是存在。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
//输出：[0,4,1,3,2]
//解释：
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,3,4,0], index = [0,1,2,3,0]
//输出：[0,1,2,3,4]
//解释：
//nums       index     target
//1            0        [1]
//2            1        [1,2]
//3            2        [1,2,3]
//4            3        [1,2,3,4]
//0            0        [0,1,2,3,4]
// 
//
// 示例 3： 
//
// 输入：nums = [1], index = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length, index.length <= 100 
// nums.length == index.length 
// 0 <= nums[i] <= 100 
// 0 <= index[i] <= i 
// 
// Related Topics 数组 
// 👍 21 👎 0


package leetcode.editor.cn;

/**
 * Java：按既定顺序创建目标数组
 * date：2020-10-15 11:14:15
 **/
public class P1389CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        Solution solution = new P1389CreateTargetArrayInTheGivenOrder().new Solution();
        // TO TEST
        int[] out = solution.createTargetArray(new int[]{4, 2, 4, 3, 2}, new int[]{0, 0, 1, 3, 1});
        for (int i : out) System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            int len = nums.length;
            int[] res = new int[len];
            for (int i = 0; i < len; i++) {
                int tmp = index[i];
                for (int j = len - 1; j > tmp; j--) {
                    res[j] = res[j - 1];
                }
                res[tmp] = nums[i];
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
