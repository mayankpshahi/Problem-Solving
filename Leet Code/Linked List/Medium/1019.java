//1019. Next Greater Node In Linked List


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
    public int[] nextLargerNodes(ListNode head) {
        if(head == null) {
            return null;
        }

        List<Integer> l = new ArrayList<>();
        while(head != null) {
            l.add(head.val);
            head = head.next;
        }

        int[] out = new int[l.size()];

        Stack<Integer> s = new Stack<>();


        for(int i = 0; i < l.size(); i++) {
            int value = l.get(i);


                while(!s.isEmpty() && value > l.get(s.peek())) {
                    out[s.pop()] = value;
                }
                s.push(i);

        }
        return out;

    }
}
