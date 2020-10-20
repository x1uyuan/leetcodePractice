//给定一个单链表 L：L0→L1→…→Ln-1→Ln ， 
//将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→… 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 示例 1: 
//
// 给定链表 1->2->3->4, 重新排列为 1->4->2->3. 
//
// 示例 2: 
//
// 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3. 
// Related Topics 链表 
// 👍 350 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* Java：重排链表
* date：2020-10-20 09:41:04
**/
public class P143ReorderList{
    public static void main(String[] args) {
        Solution solution = new P143ReorderList().new Solution();
        // TO TEST
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        solution.reorderList(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
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
    public void reorderList(ListNode head) {
        List<ListNode> lst = new ArrayList<>();
        ListNode node = head;
        ListNode dummy = new ListNode(0);
        dummy.next = node;
        while (node != null) {
            lst.add(node);
            node = node.next;
        }
        int size = lst.size();
        for (int i = 0; i < size / 2; i++) {
            dummy.next = lst.get(i);
            dummy.next.next = lst.get(size - i - 1);
            dummy = dummy.next.next;
        }
        if (size % 2 == 1) {
            dummy.next = lst.get(size / 2 + 1);
            dummy = dummy.next;
        }
        dummy.next = null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
