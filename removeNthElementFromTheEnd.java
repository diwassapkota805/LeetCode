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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
          dummyNode.next = head;

        // two pointers
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        for(int a = 1; a <= n; a++)
        {
            fast = fast.next;
        }

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummyNode.next;
    }
}
// time complexity = O(n)

// linkedlist
// 19
