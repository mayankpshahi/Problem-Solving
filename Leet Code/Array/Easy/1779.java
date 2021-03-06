
//1779. Find Nearest Point That Has the Same X or Y Coordinate

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=-1;
        int i=0;
        int dis =  Integer.MAX_VALUE;
        for(int a[]:points){
            
            if(a[0]==x || a[1]==y){
                int dis2 = Math.abs(x-a[0]) + Math.abs(y-a[1]);
                if(dis2<dis){
                    min=i;
                    dis = dis2;
                }
                    
            }
            i++;
        }
        
        return min;
        
    }
}