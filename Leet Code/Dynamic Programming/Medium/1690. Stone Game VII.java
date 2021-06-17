




//1690. Stone Game VII


class Solution {
    //int alice = 0,bob=0;
    int t[][];
    private int solve(int[] s,int i,int j,int []sum){
        if(i>j) return 0;
        if(t[i][j]!=0) return t[i][j];
        return t[i][j] =Math.max(sum[j+1]-sum[i+1]-solve(s,i+1,j,sum),sum[j]-sum[i]-solve(s,i,j-1,sum));
        
    }
    public int stoneGameVII(int[] stones) {
       int prefixsum[] =  new int[stones.length+1];
        //int sum = 0;
        
        t = new int[stones.length+1][stones.length+1];
        for(int i=0;i<stones.length;i++) {
         
              prefixsum[i+1] =  prefixsum[i] + stones[i];
          
        }
        
        return solve(stones,0,stones.length-1,prefixsum);
        
    }
}