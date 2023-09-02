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
    public ListNode deleteMiddle(ListNode head) {       
if (head == null || head.next == null) {
        // The list has 0 or 1 node, so there's no middle node to delete.
        return null;
    }

    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;

    // Use the slow and fast pointers to find the middle node.
    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    // Delete the middle node by updating the 'next' pointer of the previous node.
    if (prev != null) {
        prev.next = slow.next;
    } else {
        // If there's no previous node, the head itself is the middle node.
        head = head.next;
    }

    return head;
    }
}

// LinkedList
// 2095
