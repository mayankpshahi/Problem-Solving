

//Check if Linked List is Palindrome 

class Palindrome
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        
        Node trav = head;
        boolean check = true;
        Stack<Integer> st = new Stack<Integer>();
 
        while ( trav != null) {
            st.push(trav.data);
            trav = trav.next;
        }
        
       while (head != null) {
 
            int p = st.pop();
            if (head.data == p) {
                check = true;
            }
            else {
                check = false;
                break;
            }
            head = head.next;
        }
        return check;
    }    
}

