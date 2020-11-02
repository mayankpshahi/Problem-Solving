//147. Insertion Sort List

//O(n^2) time and O(1) space

class Solution {
    ListNode sortedInsert(ListNode sorted_head, ListNode new_node)
{

    if(sorted_head==null || sorted_head.val >= new_node.val)
    {
        new_node.next = sorted_head;
        return new_node ;
    }
    else
    {
        ListNode curr = sorted_head;
        while(curr.next != null && curr.next.val < new_node.val)curr = curr.next;
        new_node.next = curr.next;
        curr.next = new_node;
    }
    return sorted_head;
}

    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
    ListNode sorted_head = null;
    while (curr!=null)
    {
        ListNode currNext = curr.next;
        sorted_head = sortedInsert(sorted_head,curr);
        curr = currNext;
    }
    return sorted_head;

    }
}




//mergesort 
class Solution {
    public ListNode insertionSortList(ListNode head) {
        // NOTE : This is mergesort. Not insertion sort
        if(head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode preslow = null;


        while(fast != null && fast.next != null) {
            preslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        preslow.next = null;

        ListNode head1 = insertionSortList(head);
        ListNode head2 = insertionSortList(slow);

        ListNode prehead = new ListNode();
        ListNode current = prehead;

        while(head1!=null && head2 != null) {
            if(head1.val < head2.val){
                current.next = head1;
                head1 = head1.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if(head1!=null){
            current.next = head1;
        }

        if(head2!=null) {
            current.next = head2;
        }

        ListNode result = prehead.next;
        prehead.next = null;
        return result;
    }
}
