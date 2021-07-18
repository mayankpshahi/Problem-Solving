



//Reverse Nodes in k-Group




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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        
        ListNode curr =  head;
        
        while(curr!=null && count!=k){
            curr =  curr.next;
            count++;
        }
        
        if(count==k){
            curr=reverseKGroup(curr, k);
            
            while(count-->0){
            ListNode tmp = head.next; 
            head.next = curr; 
            curr = head; // move head of reversed part to a new node
            head = tmp; // move "direct" head to the next node in direct part
            }
            
            head = curr;
        }
        
        return head;
        
    }
   
}