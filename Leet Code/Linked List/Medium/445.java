//445. Add Two Numbers II

//Stack Solution

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
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode dummy = new ListNode(0);
        while ((!s1.isEmpty()) || (!s2.isEmpty())) {
            int sum = carry;
            if (!s1.isEmpty()) {
                sum += s1.pop().val;
            }
            if (!s2.isEmpty()) {
                sum += s2.pop().val;
            }
            ListNode cur = new ListNode(sum % 10);
            dummy = addToHead(dummy, cur);
            carry = sum / 10;
        }
        if (carry != 0) {
            dummy = addToHead(dummy, new ListNode(carry));
        }
        return dummy.next;

    }
    private ListNode addToHead(ListNode dummy, ListNode cur) {
        ListNode next = dummy.next;
        dummy.next = cur;
        cur.next = next;
        return dummy;
    }
}



//List Reversal Solution

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
    private ListNode reverse(ListNode l){
        ListNode prev = null;
        ListNode cur = l;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverse(l1);
        ListNode it1 = revL1;
        ListNode it2 = reverse(l2);
        ListNode prev = null;
        int carry = 0;
        while(it1 != null || it2 != null){
            if(it1 == null){
                it1 = it2;
                it2 = null;
            }
            it1.val += ((it2 != null) ? it2.val : 0) + carry;
            carry = it1.val/10;
            it1.val %= 10;
            if(prev != null){
                prev.next = it1;
            }
            prev = it1;
            it1 = it1.next;
            if(it2 != null){
                it2 = it2.next;
            }
        }
        if(carry != 0){
            prev.next = new ListNode(carry);
        }
        return reverse(revL1);
    }
}
