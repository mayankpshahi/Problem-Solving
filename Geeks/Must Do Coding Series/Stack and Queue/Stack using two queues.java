

//Stack using two queues

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    int curr_size;
  
        Queues()
        {
            curr_size = 0;
        }
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    curr_size++;
	    
            q2.add(a);
  
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
  
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if (q1.isEmpty())
                return -1;
          int p = q1.peek();
            q1.remove();
            curr_size--;
            
        return p;
    }
	
}

