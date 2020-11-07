//141. Linked List Cycle

//O(n) time and O(1) space
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head == null || head.next == null) return false;
       if(head.next == head) return true;

       ListNode nextNode = head.next;
       head.next = head;
       boolean cycle = hasCycle(nextNode);
       return cycle;

    }
}

//O(n) time and O(1) space 2 pointers

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

  return false;

    }
}
