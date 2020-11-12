//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 5239 👎 0


package leetcode.editor.cn;
/**
* Java：两数相加
* date：2020-11-12 10:13:42
**/
public class P2AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new P2AddTwoNumbers().new Solution();
        // TO TEST
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(9);
        b.next = c;
        solution.addTwoNumbers(a, b);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = l1;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            l1.val = sum % 10;
            carry = sum / 10;
            if (l1.next == null && l2.next == null) {
                if (carry == 1) {
                    ListNode tmp = new ListNode(1);
                    l1.next = tmp;
                    l1 = l1.next.next;
                    carry = 0;
                } else {
                    break;
                }
            } else if (l1.next == null) {
                l1.next = l2.next;
                l1 = l1.next;
                l2 = null;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        while (carry == 1) {
            int sum = l1.val + carry;
            l1.val = sum % 10;
            carry = sum / 10;
            if (l1.next == null) {
                if (carry == 1) {
                    ListNode tmp = new ListNode(1);
                    l1.next = tmp;
                    carry = 0;
                }
            } else {
                l1 = l1.next;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
