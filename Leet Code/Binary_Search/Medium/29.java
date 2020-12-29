//29. Divide Two Integers

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1) 
            return Integer.MAX_VALUE;
        boolean isNegative=false;
        if(dividend<0||divisor<0){
            isNegative = true;
        }
        if(dividend<0&&divisor<0){
            isNegative = false;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res=0;
        
        
        while(a-b>=0){
            int x = 0; 
            
            while(a-(b<<1<<x)>=0){
                x++;
            }
            
            res +=1<<x;
            
           
            a =  a-(b<<x);
            
        }
        
        return isNegative?-res:res;
    }
}