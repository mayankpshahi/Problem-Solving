//86. Partition List
//0ms

class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode it = head;
        ListNode smaller = new ListNode(0);
        ListNode larger = new ListNode(0);
        ListNode t1 = smaller;
        ListNode t2 = larger;

         while(it!=null){
            if(it.val<x){
                t1.next = new ListNode(it.val);
                t1 = t1.next;
            }else{
                t2.next = new ListNode(it.val);
                t2 = t2.next;
            }
            it = it.next;

        }

        t1.next = larger.next;
        return smaller.next;






    }
}
