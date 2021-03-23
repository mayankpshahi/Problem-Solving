

//Reverse a Linked List in groups of given size.


class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        if(node == null) return null;
        
        Node pre=null , next = null; 
        Node curr = node;
        
        int check = 0;
        
        while(check<k  && curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
            check++;
        }
        
        if (curr != null)
            node.next = reverse(next, k);
            
            
        return pre;
    }
}
