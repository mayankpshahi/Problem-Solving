



//1563. Stone Game V



class Solution {
    int t[][];
    public int stoneGameV(int[] s) {
        t=new int[s.length+1][s.length+1];
       return  solve(0,s.length-1,s);
    }
    private int solve(int start,int end,int [] s){
        if(start > end) return 0;
        
        if(t[start][end]!=0) return t[start][end];
        
        int r =0;
        int ans =0;
        for(int i=start;i<=end;i++) r+=s[i];
        
        int l=0;
        for(int i =start;i<end;i++){
            l+=s[i];
            r-=s[i];
            if(l<r) ans = Math.max(ans,l+solve(start,i,s));
            if(l==r) ans = Math.max(ans,l+Math.max(solve(start,i,s),solve(i+1,end,s)));
             if(r<l) ans = Math.max(ans,r+solve(i+1,end,s));
        }
        
        return t[start][end]=ans;
    }
}