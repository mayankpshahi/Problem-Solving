//1171. Remove Zero Sum Consecutive Nodes from Linked List


//O(nm)
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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> m = new  HashMap<>();


        ListNode dummy  = new ListNode(0);
        dummy.next=head;
        int sum=0;
        m.put(0,dummy);
        while(head!=null)
        {
        sum+=head.val;
            if(m.containsKey(sum))
            {
                ListNode rem = m.get(sum).next;
                int sum2=sum;
                while(rem!=head){
                    sum2+=rem.val;
                    m.remove(sum2);
                    rem=rem.next;
                }

                m.get(sum).next=head.next;
            }
        else
        {
            m.put(sum,head);
        }
        head=head.next;
        }

        return dummy.next;


    }
}

//Another approach

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode h = new ListNode();
        h.next = head;
        ListNode p = h;
        while(p.next != null) {
            ListNode q = this.zeroLast(p.next);
            if (q == null) {
                p = p.next;
            } else {
                p.next = q.next;
            }
        }
        return h.next;
    }

    private ListNode zeroLast(ListNode first) {
        int sum = first.val;
        ListNode p = first;
        while(sum != 0 && p.next != null) {
            p = p.next;
            sum += p.val;
        }
        return sum == 0 ? p : null;
    }
}
