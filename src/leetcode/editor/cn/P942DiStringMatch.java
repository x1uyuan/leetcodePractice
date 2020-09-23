//给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。 
//
// 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有： 
//
// 
// 如果 S[i] == "I"，那么 A[i] < A[i+1] 
// 如果 S[i] == "D"，那么 A[i] > A[i+1] 
// 
//
// 
//
// 示例 1： 
//
// 输入："IDID"
//输出：[0,4,1,3,2]
// 
//
// 示例 2： 
//
// 输入："III"
//输出：[0,1,2,3]
// 
//
// 示例 3： 
//
// 输入："DDI"
//输出：[3,2,0,1] 
//
// 
//
// 提示： 
//
// 
// 1 <= S.length <= 10000 
// S 只包含字符 "I" 或 "D"。 
// 
// Related Topics 数学 
// 👍 165 👎 0


package leetcode.editor.cn;

/**
 * Java：增减字符串匹配
 * date：2020-09-07 14:21:10
 **/
public class P942DiStringMatch {
    public static void main(String[] args) {
        Solution solution = new P942DiStringMatch().new Solution();
        // TO TEST
        int[] out = solution.diStringMatch("DDI");
        for (int i : out) System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] diStringMatch(String S) {
            int len = S.length() + 1;
            int[] source = new int[len];
            int[] res = new int[len];
            for (int i = 0; i < len; i++) {
                source[i] = i;
            }
            int left = 0;
            int right = len - 1;

            for (int i = 0; i < len - 1; i++) {
                if (S.charAt(i) == 'I') {
                    res[i] = source[left];
                    left++;
                }
                else {
                    res[i] = source[right];
                    right--;
                }
            }
            res[len - 1] = source[left];

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
