//魔术索引。 在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组A中找
//出一个魔术索引，如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。 
//
// 示例1: 
//
//  输入：nums = [0, 2, 3, 4, 5]
// 输出：0
// 说明: 0下标的元素为0
// 
//
// 示例2: 
//
//  输入：nums = [1, 1, 1]
// 输出：1
// 
//
// 提示: 
//
// 
// nums长度在[1, 1000000]之间 
// 
// Related Topics 数组 二分查找 
// 👍 34 👎 0


package leetcode.editor.cn;

/**
 * Java：魔术索引
 * date：2020-07-31 09:32:31
 **/
public class P0803MagicIndexLcci {
    public static void main(String[] args) {
        Solution solution = new P0803MagicIndexLcci().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMagicIndex(int[] nums) {
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (nums[i] == i) return i;
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
