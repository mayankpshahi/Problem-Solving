


//Count Total Set Bits


public class Solution {
    public int solve(int A) {
         int count=0;
         int mod = 1000000007;
A=A+1;//as we would require 0 to A to get the results instead of 1 to A
for(int i=0;i<=31;i++){
    //for each bit calculating the total number of set bits for numbers uptil A;
    // that is number of sets of 2^(i+1) ,each set consisting 2^(i) set bits and
    //then adding the remainder of bits by getting the modulus with 2^(i+1)
    //and subtracting the first 2^(i) 0's from the remainder if this result is 
    //negative just take zero
    
    count=(count%mod+(A/(int )Math.pow(2,i+1))*(int )Math.pow(2,i)%mod+
    Math.max(A%(int)Math.pow(2,i+1)-(int)Math.pow(2,i),0)%mod)%mod;
    
}



return count;
    }
   
    
}
