

//Stock buy and sell 

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
    
 
        
        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
 
        
        int i = 0;
        while (i < n - 1) {
           
            while ((i < n - 1) && (A[i + 1] <= A[i]))
                i++;
 
            
            if (i == n - 1)
                break;
 
            ArrayList<Integer> interval =  new ArrayList<Integer>();
            interval.add(i++);
            
 
          
            while ((i < n) && (A[i] >= A[i - 1]))
                i++;
 
            
            interval.add(i - 1);
             l.add(interval);
 
            
        }
 
        
        return l;
    
    }
}
