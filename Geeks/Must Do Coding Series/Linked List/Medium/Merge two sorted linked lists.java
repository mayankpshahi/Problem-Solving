

//Merge two sorted linked lists

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
      Node temp =  new Node(0);
      Node res = temp;
      
        
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                temp.next  =  head1;
                temp = temp.next;
                head1 = head1.next;
            }else{
                temp.next  =  head2;
                temp = temp.next;
                head2 = head2.next;
            }
            
        }
        if(head1!=null) temp.next = head1;
        else temp.next = head2;
        
        return res.next;
     
   } 
}
