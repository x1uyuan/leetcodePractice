//给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。 
//
// 完成所有替换操作后，请你返回这个数组。 
//
// 
//
// 示例： 
//
// 
//输入：arr = [17,18,5,4,6,1]
//输出：[18,6,6,6,1,-1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^4 
// 1 <= arr[i] <= 10^5 
// 
// Related Topics 数组 
// 👍 45 👎 0


package leetcode.editor.cn;

/**
 * Java：将每个元素替换为右侧最大元素
 * date：2020-09-09 10:29:49
 **/
public class P1299ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        Solution solution = new P1299ReplaceElementsWithGreatestElementOnRightSide().new Solution();
        // TO TEST
        int[] out = solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        for (int i : out) System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] replaceElements(int[] arr) {
            int len = arr.length;
            int[] res = new int[len];
            int max = Integer.MIN_VALUE;
            for (int i = len - 2; i >= 0; i--) {
                res[i] = Math.max(max, arr[i + 1]);
                max = res[i];
            }
            res[len - 1] = -1;
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
