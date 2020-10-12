//给你个整数数组 arr，其中每个元素都 不相同。 
//
// 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [4,2,1,3]
//输出：[[1,2],[2,3],[3,4]]
// 
//
// 示例 2： 
//
// 输入：arr = [1,3,6,10,15]
//输出：[[1,3]]
// 
//
// 示例 3： 
//
// 输入：arr = [3,8,-10,23,19,-4,-14,27]
//输出：[[-14,-10],[19,23],[23,27]]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 10^5 
// -10^6 <= arr[i] <= 10^6 
// 
// Related Topics 数组 
// 👍 37 👎 0


package leetcode.editor.cn;

import com.jcraft.jsch.MAC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java：最小绝对差
 * date：2020-10-12 10:46:54
 **/
public class P1200MinimumAbsoluteDifference {
    public static void main(String[] args) {
        Solution solution = new P1200MinimumAbsoluteDifference().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            int min = Integer.MAX_VALUE;
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(arr);
            for (int i = 1; i < arr.length; i++) {
                int tmp = arr[i] - arr[i - 1];
                if (tmp <= min) {
                    if (tmp < min) {
                        res.clear();
                        min = tmp;
                    }
                    List<Integer> lst = new ArrayList<>();
                    lst.add(arr[i - 1]);
                    lst.add(arr[i]);
                    res.add(lst);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
