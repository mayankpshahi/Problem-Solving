
//Kth smallest element 

public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    //Your code here
    Queue<Integer> minheap = new PriorityQueue<>();
    for(int i:arr)
     minheap.add(i);
     
     int small=0;
     
    for(int i=0;i<k;i++)
      small=minheap.poll();
      
    return small;
    
} 