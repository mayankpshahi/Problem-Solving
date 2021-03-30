

//Queue using two Stacks

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
	  // int p = s1.pop();
	  // s2.push(p);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   int p;
	   
	   if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
  
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                p = s1.pop(); 
                s2.push(p);
            }
        }
        p = s2.pop();
       
	   
	   return p;
    }
}
