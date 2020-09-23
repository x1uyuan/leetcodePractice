//给你两个数组，arr1 和 arr2， 
//
// 
// arr2 中的元素各不相同 
// arr2 中的每个元素都出现在 arr1 中 
// 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例： 
//
// 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 
//
// 提示： 
//
// 
// arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
// Related Topics 排序 数组 
// 👍 78 👎 0


package leetcode.editor.cn;

import java.util.*;

/**
 * Java：数组的相对排序
 * date：2020-09-09 14:24:57
 **/
public class P1122RelativeSortArray {
    public static void main(String[] args) {
        Solution solution = new P1122RelativeSortArray().new Solution();
        // TO TEST
        int[] out = solution.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});
        for (int i : out) System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
//            int k = 0, nums[] = new int[1001], res[] = new int[arr1.length];
//            for (int i : arr1)  nums[i]++;
//            for (int j : arr2)  while (nums[j]-- > 0) res[k++] = j;
//            for (int q = 0; q < nums.length; q++) while(nums[q]-- > 0) res[k++] = q;
//            return res;

            Map<Integer, Integer> map = new HashMap<>();
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
                map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
            }

            int index = 0;

            for (int i = 0; i < arr2.length; i++) {
                set.remove(arr2[i]);
                int time = map.get(arr2[i]);
                for (int j = 0; j < time; j++) {
                    arr1[index] = arr2[i];
                    index++;
                }
            }

            int fromIndex = index;

            for (int i : set) {
                int time = map.get(i);
                for (int j = 0; j < time; j++) {
                    arr1[index] = i;
                    index++;
                }
            }

            Arrays.sort(arr1, fromIndex, arr1.length);
            return arr1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
