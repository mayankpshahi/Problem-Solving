
//Delete without head pointer 

class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         if(del == null)
         return;
         else if (del.next == null)
         return;
         
         //Node nextone = node.next;
         del.data = del.next.data;
         
         del.next = del.next.next;
    }
}

