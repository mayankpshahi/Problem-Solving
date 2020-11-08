//92. Reverse Linked List II

//O(n)
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
       ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode startNode = dummy;
        int i = 1;
        while(i < m && startNode != null){
            startNode = startNode.next;
            i++;
        }
        if(startNode == null || startNode.next == null) return head;
        ListNode pre = startNode.next;
        ListNode cur = pre.next;
        while(i < n && cur != null){
            pre.next = cur.next;
            cur.next = startNode.next;
            startNode.next = cur;
            cur = pre.next;
            i++;
        }
        return dummy.next;
    }
}
