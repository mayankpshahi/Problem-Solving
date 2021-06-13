


//Distinct Numbers in Window


public class Solution {
    public int[] dNums(int[] A, int B) {
    int n = A.length;
    
    if(B>n)
    {
        int a[] = new int[0];
        return a;
    }
    
    
    int a[] = new int[n-B+1];
    int l=0;
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i=0;i<n;i++)
    {
        if(map.containsKey(A[i]))
        {
            map.put(A[i], map.get(A[i])+1);
        }
        
        else
        {
            map.put(A[i] , 1);
        }
        
        
        
        if(i>=B-1)
        {
            a[l++]=map.size();
            
            map.put(A[i-B+1] , map.get(A[i-B+1])-1);
            
            if(map.get(A[i-B+1])==0)
            map.remove(A[i-B+1]);
        }
        
    }
    
    return a;
    }
}
