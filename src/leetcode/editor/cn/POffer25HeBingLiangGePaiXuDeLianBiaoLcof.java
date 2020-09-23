//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 分治算法 
// 👍 37 👎 0


package leetcode.editor.cn;

/**
 * Java：合并两个排序的链表
 * date：2020-07-24 16:17:01
 **/
public class POffer25HeBingLiangGePaiXuDeLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new POffer25HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
        // TO TEST
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(2);
        ListNode c1 = new ListNode(4);
        a1.next = b1;
        b1.next = c1;
        ListNode a2 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode c2 = new ListNode(4);
        a2.next = b2;
        b2.next = c2;
        ListNode out = solution.mergeTwoLists(a1, a2);
        while (out != null) {
            System.out.println(out.val);
            out = out.next;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode head1 = head;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    head1.next = l1;
                    l1 = l1.next;
                } else {
                    head1.next = l2;
                    l2 = l2.next;
                }
                head1 = head1.next;
            }
            if (l1 == null && l2 != null) head1.next = l2;
            if (l1 != null && l2 == null) head1.next = l1;
            return head.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
