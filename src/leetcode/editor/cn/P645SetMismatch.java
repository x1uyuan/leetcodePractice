//集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重
//复。 
//
// 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,2,4]
//输出: [2,3]
// 
//
// 注意: 
//
// 
// 给定数组的长度范围是 [2, 10000]。 
// 给定的数组是无序的。 
// 
// Related Topics 哈希表 数学 
// 👍 129 👎 0


package leetcode.editor.cn;

/**
 * Java：错误的集合
 * date：2020-11-03 14:15:08
 **/
public class P645SetMismatch {
    public static void main(String[] args) {
        Solution solution = new P645SetMismatch().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int len = nums.length;
            int[] res = new int[2];
            int[] count = new int[len];
            for (int i : nums) count[i - 1]++;
            for (int i = 0; i < len; i++) {
                if (count[i] == 0) res[1] = i + 1;
                if (count[i] == 2) res[0] = i + 1;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
