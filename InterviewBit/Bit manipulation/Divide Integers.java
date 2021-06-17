


//Divide Integers


public class Solution {
    public int divide(int A, int B) {
        if(A==Integer.MIN_VALUE&&B==-1)
         return Integer.MAX_VALUE;
         if(A==Integer.MIN_VALUE&&B==1)
         return Integer.MIN_VALUE;
         long  a=A,b=B;
         int sign = ((A < 0) ^ (B < 0)) ? -1 : 1;
         a=Math.abs(a);b=Math.abs(b);
         int ans=0;
         while(a>=b)
         { a=a-b;
         ans++;
             
         }
         return ans*sign;
    }
}
