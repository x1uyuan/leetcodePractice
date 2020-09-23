//给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动将会使 n - 1 个元素增加 1。 
//
// 
//
// 示例: 
//
// 输入:
//[1,2,3]
//
//输出:
//3
//
//解释:
//只需要3次移动（注意每次移动会增加两个元素的值）：
//
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
// 
// Related Topics 数学 
// 👍 143 👎 0


package leetcode.editor.cn;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Java：最小移动次数使数组元素相等
 * date：2020-09-10 15:31:45
 **/
public class P453MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        Solution solution = new P453MinimumMovesToEqualArrayElements().new Solution();
        // TO TEST
//        System.out.println(solution.minMoves(new int[] {1, 2, 3}));
        Queue<Integer> dq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        if (1 == 2)
        dq.add(2);
        dq.add(1);
        dq.add(3);
        System.out.println(dq.remove());
        System.out.println(dq.remove());
        System.out.println(dq.remove());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minMoves(int[] nums) {
            int len = nums.length;
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            int time = 0;
            while (true) {
                float lval = (float)((len - 1) * time + sum) / (float) len;
                int intVal = ((len - 1) * time + sum) / len;
                if (lval == intVal) return time;
                time++;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
