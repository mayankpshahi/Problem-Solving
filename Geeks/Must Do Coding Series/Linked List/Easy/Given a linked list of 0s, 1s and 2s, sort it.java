

//Given a linked list of 0s, 1s and 2s, sort it. 

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
       int count[] = {0, 0, 0}; 
         
       Node trav = head;
         
       while (trav != null) 
       {
            count[trav.data]++;
            trav = trav.next;
       }
  
       int i = 0;
       trav = head;
  
        while (trav != null) 
        {
            if (count[i] == 0)
                i++;
            else 
            {
               trav.data= i;
               --count[i];
               trav = trav.next;
            }
         }
         
       return head;
    }
}


