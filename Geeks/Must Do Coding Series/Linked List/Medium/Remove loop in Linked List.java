
//Remove loop in Linked List

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
         if (head == null || head.next == null)
            return;
        
         Node slow = head, fast = head;
         
        

        while(fast!=null && fast.next!=null){
            
             
            slow = slow.next;
            fast = fast.next.next;
            
            
             if(slow == fast){
                  if(slow==head)
               {
                   while(fast.next!=head)
                   fast=fast.next;

               }
               else
               {
                   slow=head;
                   while(slow.next!=fast.next)
                   {
                       slow = slow.next;
                   fast = fast.next;
                   }
               }
              fast.next = null;
             }
           
        }
        
        
        
        
    }
}