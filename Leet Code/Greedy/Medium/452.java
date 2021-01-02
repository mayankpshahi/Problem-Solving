//452. Minimum Number of Arrows to Burst Balloons

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        
       int arwcount = 1;
        int lasteleEnd = points[0][1];
  
        for(int i = 1 ; i<points.length ; i++ ){
           
           
            if(points[i][0] > lasteleEnd){
                arwcount++;
                lasteleEnd = points[i][1];
            }
            
        }
        
        return arwcount;
        
    }
}