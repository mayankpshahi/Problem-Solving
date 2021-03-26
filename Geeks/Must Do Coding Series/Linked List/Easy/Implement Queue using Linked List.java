

//Implement Queue using Linked List

class MyQueue
{
    QueueNode front, rear;
    
    public MyQueue()
    {
        this.front = this.rear = null;
    }
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode n = new QueueNode(a);
        
       if (this.rear == null) {
            this.front = this.rear = n;
            return;
        }
  
       
        this.rear.next = n;
        this.rear = this.rear.next;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
         if (this.front == null)
            return -1;
  
        
         QueueNode n = this.front;
        this.front = this.front.next;
  
       
        if (this.front == null)
            this.rear = null;
            
        return n.data;
	}
}