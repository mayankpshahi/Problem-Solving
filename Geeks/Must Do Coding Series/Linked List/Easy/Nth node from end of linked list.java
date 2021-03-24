   

//Nth node from end of linked list

   class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node start =  head;
    	int len =1;
    	
    	while(start!=null && start.next!=null){
    	    start = start.next;
    	    len++;
    	}
    	start =head;
    	if(n<=len){
    	for(int i=0;i<len-n;i++) start = start.next;
    	
    	
    	return start.data;}
    	
    	return -1;
    	
    }
}
