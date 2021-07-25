




//600. Non-negative Integers without Consecutive Ones



class Solution {
    public int findIntegers(int n) {
        int fib[]  = new int[31];
        fib[0]=1;
        fib[1]=2;
        for(int i=2;i<31;i++) fib[i] =  fib[i-1] +  fib[i-2];
        
        int res = 0,k=30,pre=0;
        while(k>=0){
         
            if((n&(1<<k))>0){
                res+=fib[k];
                if(pre==1)return res;
                pre=1;
            }else{
                pre=0;
            }
            k--;
        }
        
        return res+1;
        
    }
}