



//1510. Stone Game IV


class Solution {
    int t[];
    public boolean winnerSquareGame(int n) {
        t =  new int[n+1];
        Arrays.fill(t,-1);
        return solve(n)==1?true:false;
    }
    private int solve(int n){
        if(n<=0) return t[n]=0;
        if(t[n]!=-1) return t[n];
        for(int i=1;i*i<=n;i++){
            if(solve(n-i*i)==0) return t[n]= 1;
        }
        return t[n]=0;
    }
}