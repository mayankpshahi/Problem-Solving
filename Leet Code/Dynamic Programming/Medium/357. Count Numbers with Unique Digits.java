



//357. Count Numbers with Unique Digits

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
       if(n==0)
            return 1;
        int i=9;
        int ans=9;
        int temp=n;
        while(temp-->1)
            ans*=i--;
        
        return ans+ countNumbersWithUniqueDigits(n-1);
        
    }
}