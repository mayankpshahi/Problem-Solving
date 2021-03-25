

//Pairwise swap elements of a linked list


class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null|| head.next==null)return head;
        
        Node first=head;
        Node second=head.next;
        head=second;
        while(true)
        {
            Node node=second.next;
            second.next=first;
            if(node==null || node.next==null)
            {
                first.next=node;
                break;
            }
            first.next=node.next;
            first=node;
            second=first.next;
        }
        return head;
    }
}