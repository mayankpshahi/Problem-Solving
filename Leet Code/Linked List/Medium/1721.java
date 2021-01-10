//1721. Swapping Nodes in a Linked List

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head;
        ListNode end   = null;
        int len =0;
        while(start.next!=null) {
            
            start = start.next;
            len++;
            
        }
       
        len = len -k+1;;
        start = head;
        end = head;
        while(k-->1){
            start = start.next;
            
        }
        while(len-->0){
            end = end.next;
        }
       
        int swap = start.val;
        start.val = end.val;
        end.val = swap;
        
        
        return head;
        
    }
}