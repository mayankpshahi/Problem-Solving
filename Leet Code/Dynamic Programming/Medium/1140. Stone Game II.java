




//1140. Stone Game II

class Solution {
     int t[][];
    public int stoneGameII(int[] piles) {
        int sum=0;
        for(int a:piles)sum+=a;
        
        t =  new int[piles.length + 1][201];
        int diff = solve(piles,0,1);
       
        
        return (sum+diff)/2;
        
    }
    private int solve(int[]s ,int i,int m){
        if(i>=s.length)return 0;
        else if(t[i][m]!=0) return t[i][m];
        else{
            int res =  Integer.MIN_VALUE;
            int total = 0;
            for(int j=0;j<2*m;j++){
                if(i+j<s.length)total+=s[i+j];
                res = Math.max(res,total-solve(s,i+j+1,Math.max(m,j+1)));
            }
        
             return t[i][m]=res;
        }
    }
}