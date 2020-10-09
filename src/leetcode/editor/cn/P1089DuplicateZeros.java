//给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。 
//
// 注意：请不要在超过该数组长度的位置写入元素。 
//
// 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。 
//
// 
//
// 示例 1： 
//
// 输入：[1,0,2,3,0,4,5,0]
//输出：null
//解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
// 
//
// 示例 2： 
//
// 输入：[1,2,3]
//输出：null
//解释：调用函数后，输入的数组将被修改为：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10000 
// 0 <= arr[i] <= 9 
// 
// Related Topics 数组 
// 👍 60 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java：复写零
 * date：2020-10-09 14:36:08
 **/
public class P1089DuplicateZeros {
    public static void main(String[] args) {
        Solution solution = new P1089DuplicateZeros().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void duplicateZeros(int[] arr) {
            int[] copy = arr.clone();
            int i = 0;
            int j = 0;
            while (i < arr.length && j < arr.length) {
                int tmp = copy[i];
                if (tmp == 0) {
                    arr[j] = 0;
                    if (j + 1 < arr.length) arr[j + 1] = 0;
                    j++;
                } else {
                    arr[j] = tmp;
                }
                i++;
                j++;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
