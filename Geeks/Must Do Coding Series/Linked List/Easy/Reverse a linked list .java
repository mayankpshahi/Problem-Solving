

//Reverse a linked list 

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node pre = null,next=null;
        Node curr = head;
        
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        
       
        
        return pre;
        
    }
}
