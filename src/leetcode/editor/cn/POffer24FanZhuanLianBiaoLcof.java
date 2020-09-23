//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 链表 
// 👍 68 👎 0


package leetcode.editor.cn;

/**
 * Java：反转链表
 * date：2020-07-23 17:24:39
 **/
public class POffer24FanZhuanLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new POffer24FanZhuanLianBiaoLcof().new Solution();
        // TO TEST
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode out = solution.reverseList(a);
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
        public ListNode reverseList(ListNode head) {
            if (head == null) return head;
            ListNode head1 = head;
            ListNode next = head.next;
            while (next != null) {
                ListNode tmp = next.next;
                head.next.next = head1;
                head.next = tmp;
                head1 = next;
                next = tmp;
            }
            return head1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
