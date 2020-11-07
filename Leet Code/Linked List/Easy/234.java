//234. Palindrome Linked List


//Iterative
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
    public ListNode reverseList(ListNode head) {
         if (head == null || head.next == null)
            return head;


        ListNode rest = reverseList(head.next);
        head.next.next = head;


        head.next = null;


        return rest;

    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode prev = null, slow = head, fast = head, l1 = head;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l2 = (fast == null) ? reverseList(slow) : reverseList(slow.next);


        while (l1 != null && l2 != null) {
      if (l1.val != l2.val)
        return false;

      l1 = l1.next;
      l2 = l2.next;
    }

    return true;
    }
}

//Recursive

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
     boolean flag=true;
    ListNode solve(ListNode p1, ListNode p2){
        if(p1 == null) return p2;
        ListNode node = solve(p1.next,p2);
        if(node.val != p1.val) flag = false;
        return node.next;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode p1,p2;
        p1=p2=head;
        solve(p1,p2);
        return flag;
    }
}
