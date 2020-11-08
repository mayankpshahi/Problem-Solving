//725. Split Linked List in Parts

//
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
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        ListNode t = root;
        while(t!= null){
            len++;
            t = t.next;
        }
        t = root;

        int parts = len / k;
        int rem = len % k;

        ListNode[] res = new ListNode[k];

        if(root == null)return res;
        for(int i = 0; i < k; i++){
            ListNode newNode = new ListNode(-1);
            ListNode ptr = newNode;
            int iter = parts;
            if(rem >= 1){
                iter += 1;
                rem--;
            }
            while(t != null && iter > 0){
                ptr.next = t;
                t = t.next;
                ptr = ptr.next;
                iter--;
            }
            ptr.next = null;
            res[i] = newNode.next;
        }
        return res;


    }
}
