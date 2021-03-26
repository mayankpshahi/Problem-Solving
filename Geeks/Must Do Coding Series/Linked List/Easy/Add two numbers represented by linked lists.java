

//Add two numbers represented by linked lists 

class Solution{
    //Function to add two numbers represented by linked list.
   static Node reverseList(Node head)
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
    
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverseList(first);
        second = reverseList(second);
        
        Node res = null;
        Node pre = null;
        Node node = null;
        int c = 0, sum;
 
        
        while (first != null || second != null) {
           
            sum = c + (first != null ? first.data : 0)
                  + (second != null ? second.data : 0);
 
          
            c = (sum >= 10) ? 1 : 0;
 
            
            sum = sum % 10;
 
           
            node = new Node(sum);
 
          
            if (res == null) {
                res = node;
            }else {
                pre.next = node;
            }
 
         
            pre = node;
 
          
            if (first != null) 
                first = first.next;
            
            if (second != null) 
                second = second.next;
            
        }
 
        if (c > 0) {
            node.next = new Node(c);
        }
        
        res = reverseList(res);
        return res;
 
       
    }
}