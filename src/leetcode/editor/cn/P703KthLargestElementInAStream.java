//设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。 
//
// 请实现 KthLargest 类： 
//
// 
// KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。 
// int add(int val) 返回当前数据流中第 k 大的元素。 
// 
//
// 
//
// 示例： 
//
// 
//输入：
//["KthLargest", "add", "add", "add", "add", "add"]
//[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
//输出：
//[null, 4, 5, 5, 8, 8]
//
//解释：
//KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
//kthLargest.add(3);   // return 4
//kthLargest.add(5);   // return 5
//kthLargest.add(10);  // return 5
//kthLargest.add(9);   // return 8
//kthLargest.add(4);   // return 8
// 
//
// 
//提示：
//
// 
// 1 <= k <= 104 
// 0 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// -104 <= val <= 104 
// 最多调用 add 方法 104 次 
// 题目数据保证，在查找第 k 大元素时，数组中至少有 k 个元素 
// 
// Related Topics 堆 设计 
// 👍 160 👎 0


package leetcode.editor.cn;

import java.util.PriorityQueue;

/**
 * Java：数据流中的第 K 大元素
 * date：2020-11-02 13:46:17
 **/
public class P703KthLargestElementInAStream {
    public static void main(String[] args) {
//        Solution solution = new P703KthLargestElementInAStream().new Solution();
        // TO TEST
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        kthLargest.add(3);
        kthLargest.add(5);
        kthLargest.add(10);
        kthLargest.add(9);
        kthLargest.add(4);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class KthLargest {
        private PriorityQueue<Integer> PriorityQueue;
        private int fixed_k;

        // KthLargest 创建一个最小堆，写入k个大的元素
        public KthLargest(int k, int[] nums) {
            fixed_k = k;
            PriorityQueue = new PriorityQueue<>(k);
            for (int val : nums) add(val);
        }

        public int add(int val) {
            // size小于k，直接放入
            if (PriorityQueue.size() < fixed_k) {
                PriorityQueue.add(val);
            } else if (val > PriorityQueue.peek()) {
                // val大于队首元素，则删除队首 添加val
                PriorityQueue.poll();
                PriorityQueue.add(val);
            }
            // PriorityQueue中保存k个大的元素，PriorityQueue中队首元素就是第k个元素
            return PriorityQueue.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
