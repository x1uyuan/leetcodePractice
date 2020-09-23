//给定一个范围在 1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。 
//
// 找到所有在 [1, n] 范围之间没有出现在数组中的数字。 
//
// 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。 
//
// 示例: 
//
// 
//输入:
//[4,3,2,7,8,2,3,1]
//
//输出:
//[5,6]
// 
// Related Topics 数组 
// 👍 451 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：找到所有数组中消失的数字
 * date：2020-09-07 15:17:31
 **/
public class P448FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Solution solution = new P448FindAllNumbersDisappearedInAnArray().new Solution();
        // TO TEST
        List<Integer> out = solution.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
        for (int i : out) System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> lst = new ArrayList<>();
            if (nums.length == 0) return lst;
            int index = 0;
            while (index < nums.length) {
                if (nums[index] != index + 1 && nums[nums[index] - 1] != nums[index]) {
                    int tmp = nums[index];
                    int tmp1 = nums[index] - 1;
                    nums[index] = nums[nums[index] - 1];
                    nums[tmp1] = tmp;
                } else {
                    index++;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) lst.add(i + 1);
            }
            return lst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
