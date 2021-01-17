//1725. Number Of Rectangles That Can Form The Largest Square

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int [] sq =  new int[rectangles.length];
        
        for(int i=0;i<rectangles.length;i++)
            sq[i]=Math.min(rectangles[i][0],rectangles[i][1]);
        
        
        int count = 0;
        int max =sq[0];
        for(int i=0;i<sq.length;i++)
            if(sq[i]>max)
                max=sq[i];
        
        for(int i=0;i<sq.length;i++){
            if(sq[i]==max)
                count++;
        
        }
        
        return count;
        
    }
}