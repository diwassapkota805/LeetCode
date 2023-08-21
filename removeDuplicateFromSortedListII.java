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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0,head); // next node is set to head

        ListNode prev = dummyNode;

        while(head != null)
        {
            if(head.next != null && head.val == head.next.val)
            {
                while(head != null && head.val == head.next.val)
                {
                    head = head.next;
                }
                prev.next = head.next;
            }
            else
            {
                prev = prev.next;
            }

            head = head.next;
        }

        return dummyNode.next;

    }
}
// 1            2           2      3
// prev                            head

// LinkedList
// 82
