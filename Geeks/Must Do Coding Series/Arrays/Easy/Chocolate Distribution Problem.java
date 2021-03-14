

//Chocolate Distribution Problem

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        
        long min =  Long.MAX_VALUE;
        
        for(long i=0;i+m-1<n;i++){
            long diff = a.get((int)(i+m-1))-a.get((int)i);
            min = Math.min(diff,min);
        }
        
        return min;
       
    }
}