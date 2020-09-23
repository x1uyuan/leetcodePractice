//给出一个整数数组 A 和一个查询数组 queries。 
//
// 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上
//。然后，第 i 次查询的答案是 A 中偶数值的和。 
//
// （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。） 
//
// 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。 
//
// 
//
// 示例： 
//
// 输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//输出：[8,6,2,4]
//解释：
//开始时，数组为 [1,2,3,4]。
//将 1 加到 A[0] 上之后，数组为 [2,2,3,4]，偶数值之和为 2 + 2 + 4 = 8。
//将 -3 加到 A[1] 上之后，数组为 [2,-1,3,4]，偶数值之和为 2 + 4 = 6。
//将 -4 加到 A[0] 上之后，数组为 [-2,-1,3,4]，偶数值之和为 -2 + 4 = 2。
//将 2 加到 A[3] 上之后，数组为 [-2,-1,3,6]，偶数值之和为 -2 + 6 = 4。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 10000 
// -10000 <= A[i] <= 10000 
// 1 <= queries.length <= 10000 
// -10000 <= queries[i][0] <= 10000 
// 0 <= queries[i][1] < A.length 
// 
// Related Topics 数组 
// 👍 46 👎 0


package leetcode.editor.cn;

/**
 * Java：查询后的偶数和
 * date：2020-09-21 14:06:58
 **/
public class P985SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        Solution solution = new P985SumOfEvenNumbersAfterQueries().new Solution();
        // TO TEST
        for (int i : solution.sumEvenAfterQueries(new int[]{1,2,3,4}, new int[][]{{1,0},{-3,1},{-4,0},{2,3}}))
            System.out.println(i);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            int len = queries.length;
            int[] res = new int[len];
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) sum += A[j];
            }
            for (int i = 0; i < len; i++) {
                int before = A[queries[i][1]] % 2 == 0 ? 0 : 1;
                int after = queries[i][0] % 2 == 0 ? 0 : 1;
                if (before == 0) {
                    if (after == 0) {
                        sum += queries[i][0];
                    } else {
                        sum -= A[queries[i][1]];
                    }
                } else {
                    if (after == 1) {
                        sum += A[queries[i][1]] + queries[i][0];
                    }
                }
                A[queries[i][1]] = A[queries[i][1]] + queries[i][0];
                res[i] = sum;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
