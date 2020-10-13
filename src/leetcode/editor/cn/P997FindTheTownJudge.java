//在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。 
//
// 如果小镇的法官真的存在，那么： 
//
// 
// 小镇的法官不相信任何人。 
// 每个人（除了小镇法官外）都信任小镇的法官。 
// 只有一个人同时满足属性 1 和属性 2 。 
// 
//
// 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。 
//
// 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。 
//
// 
//
// 示例 1： 
//
// 输入：N = 2, trust = [[1,2]]
//输出：2
// 
//
// 示例 2： 
//
// 输入：N = 3, trust = [[1,3],[2,3]]
//输出：3
// 
//
// 示例 3： 
//
// 输入：N = 3, trust = [[1,3],[2,3],[3,1]]
//输出：-1
// 
//
// 示例 4： 
//
// 输入：N = 3, trust = [[1,2],[2,3]]
//输出：-1
// 
//
// 示例 5： 
//
// 输入：N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
//输出：3 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 1000 
// trust.length <= 10000 
// trust[i] 是完全不同的 
// trust[i][0] != trust[i][1] 
// 1 <= trust[i][0], trust[i][1] <= N 
// 
// Related Topics 图 
// 👍 87 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Java：找到小镇的法官
 * date：2020-10-13 15:53:08
 **/
public class P997FindTheTownJudge {
    public static void main(String[] args) {
        Solution solution = new P997FindTheTownJudge().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findJudge(int N, int[][] trust) {
//            int[][] mark = new int[N][N];
//            int[] rowSum = new int[N];
//            int[] colSum = new int[N];
//            for (int[] arr : trust) {
//                mark[arr[0] - 1][arr[1] - 1] = 1;
//            }
//            for (int j = 0; j < N; j++) {
//                int sum = 0;
//                for (int i = 0; i < N; i++) {
//                    if (mark[i][j] == 1) sum++;
//                }
//                colSum[j] = sum;
//            }
//            for (int i = 0; i < N; i++) {
//                int sum = 0;
//                for (int j = 0; j < N; j++) {
//                    if (mark[i][j] == 1) sum++;
//                }
//                rowSum[i] = sum;
//            }
//
//            for (int i = 0; i < N; i++) {
//                if (colSum[i] == N - 1 && rowSum[i] == 0) return i + 1;
//            }
//            return -1;

//            if (trust.length == 0 && N == 1) return 1;
//            Set<Integer> set = new HashSet<>();
//            Map<Integer, Integer> sum = new HashMap<>();
//
//            for (int[] arr : trust) {
//                set.add(arr[0]);
//                sum.put(arr[1], sum.getOrDefault(arr[1], 0) + 1);
//            }
//
//            for (int i : sum.keySet()) {
//                if (sum.get(i) == N - 1 && !set.contains(i)) return i;
//            }
//            return -1;
            int[] rowSum = new int[N];
            int[] colSum = new int[N];
            for (int[] arr : trust) {
                rowSum[arr[0] - 1] = 1;
                colSum[arr[1] - 1] = colSum[arr[1] - 1] + 1;
            }
            for (int i = 0; i < N; i++) {
                if (colSum[i] == N - 1 && rowSum[i] == 0) return i + 1;
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
