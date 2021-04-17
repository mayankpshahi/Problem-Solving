
//1828. Queries on Number of Points Inside a Circle


class Solution {
    
    static boolean isInside(int circle_x, int circle_y, int rad, int x, int y){
    
        if ((x - circle_x) * (x - circle_x) +(y - circle_y) * (y - circle_y) <= rad * rad)
            return true;
        else
            return false;
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int res[] =  new int[queries.length];
        int t = 0;
        
        for(int q[]:queries){
        for(int p[]:points){
            if(isInside(q[0],q[1],q[2],p[0],p[1]))
                res[t]++;
            }
            t++;
        }
        
        return res;
        
    }
}