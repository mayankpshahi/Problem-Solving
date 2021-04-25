

//1837. Sum of Digits in Base K

class Solution {
    public int sumBase(int n, int k) {
        
    int unit, sum = 0;
    while (n > 0)
    {
         
        
        unit = n % k;
 
        sum += unit;
 
       
        n = n / k;
    }
    return sum;
    }
}