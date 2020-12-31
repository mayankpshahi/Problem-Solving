//1094. Car Pooling

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int tripcount[] = new int[1001];
        for(int[]t:trips){
            for(int i = t[1];i<t[2];i++)
                tripcount[i]+=t[0];
        }
        if(Arrays.stream(tripcount).max().getAsInt()<=capacity)
            return true;
        else
            return false;
        
    }
}


//Best Soln  O(N)
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int total=0, end=0;
        for(int[] t:trips)
        {
            total+=t[0];
            end= Math.max(end, t[2]);
        }
        
        if(total<=capacity)
            return true;
        int[] stops=new int[end+1];
        
        for (int t[] : trips) {
            stops[t[1]] += t[0];
            stops[t[2]] -= t[0];
        }
        
        for(int i=0; i<end+1; i++)
        {
            capacity=capacity-stops[i];
            if(capacity<0)
                return false;
        }
        return true;
    }
}