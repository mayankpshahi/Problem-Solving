
//1759. Count Number of Homogenous Substrings

class Solution {
    public int countHomogenous(String s) {
        int mod = 1000000007;
        int sum = 0;
        int len = 1;
        sum = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                len++;
                sum = (sum+len)%mod;
            }
            else{
                len = 1;
                sum = (sum + len)%mod;
            }
        }
        return sum;
    }
}