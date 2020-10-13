//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表 
// 👍 671 👎 0


package leetcode.editor.cn;

/**
 * Java：两两交换链表中的节点
 * date：2020-10-13 10:00:40
 **/
public class P24SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new P24SwapNodesInPairs().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0);
            ListNode p0 = dummy;
            dummy.next = head;
            while (dummy != null && dummy.next != null && dummy.next.next != null) {
                ListNode p1 = p0.next;
                ListNode p2 = p1.next;
                p0.next = p2;
                p1.next = p2.next;
                p2.next = p1;
                p0 = p1;
            }
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
