



//1406. Stone Game III


class Solution {
    int t[];
    public String stoneGameIII(int[] stoneValue) {
        t =  new int[stoneValue.length + 1];
        int alice = solve(stoneValue,0);
        if(alice>0) return "Alice";
        else if(alice==0) return "Tie";
        else return "Bob";
        
    }
    private int solve(int[]s ,int i){
        if(i>=s.length)return 0;
        else if(t[i]!=0) return t[i];
        else{
            int res =  Integer.MIN_VALUE;
            res = Math.max(res,s[i]-solve(s,i+1));
            if(i+1<s.length)res = Math.max(res,s[i]+s[i+1]-solve(s,i+2));
             if(i+2<s.length)res = Math.max(res,s[i]+s[i+1]+s[i+2]-solve(s,i+3));
             return t[i]=res;
        }
    }
}