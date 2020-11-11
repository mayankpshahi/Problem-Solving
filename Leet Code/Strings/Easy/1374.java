//1374. Generate a String With Characters That Have Odd Counts


//O(n)
class Solution {
    public String generateTheString(int n) {
        int end = (n % 2 == 0) ? n - 1 : n;
        StringBuilder res  = new StringBuilder();
        
        for (int i = 0; i < end; i++){
            res.append('p');
        }
        
        if( n % 2 == 0){
            res.append('z');
        }
        return res.toString();
        
    }
}