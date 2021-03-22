

//Rotate a Linked List

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node trav = head,curr = head;
        Node store = head;
        
        while(curr.next!=null) curr = curr.next;
        
        curr.next =head;
        
        while(k-->1){
            trav = trav.next;
            
        }
        
        
       store = trav.next;
       trav.next = null;
       
       
       
       
       return store;
       
    }
}
