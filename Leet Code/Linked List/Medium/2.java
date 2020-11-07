//2. Add Two Numbers

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode sum = new ListNode();
        ListNode p;
        p = sum;
        while(l1!=null || l2!=null || c!=0){
            if (l1 != null) {
            c += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            c += l2.val;
            l2 = l2.next;
        }
        p.next = new ListNode(c%10);
        c /= 10;
        p = p.next;


        }
        return sum.next;

    }
}
