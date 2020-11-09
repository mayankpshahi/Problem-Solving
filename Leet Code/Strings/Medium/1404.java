//1404. Number of Steps to Reduce a Number in Binary Representation to One

//O(n)
class Solution {
    public int numSteps(String s) {
        char c[]=s.toCharArray();
        int l=c.length;
        int ops=0;
        for(int i=l-1;i>=0;i--){
            if(i==0 && c[0]=='1')
                break;
            if(c[i]=='1'){
                i--;
                ops++;
                while(i>=0 && c[i]!='0'){
                    c[i]='0';
                    i--;
                    ops++;
                }
                if(i>=0){
                    c[i]='1';
                    i++;
                }
            }
            ops++;
        }
        return ops;
    }
}

//O(n)  Best Approach
/*We have to push all 1s to be only one 1 which takes middle zeros + 1 moves.
And reduce it to one will cost len(s) - 1 moves

Example:
110010 -> 110100 -> 111000 -> 1000000 takes 2(which is count of mid zeros) + 1 moves.
1000000 -> 1 takes 6 moves because length of s increases 1.*/



class Solution {
    public int numSteps(String s) {
        int i= 0, mid_zero = 0;
        for(int j =1;j<s.length();j++){
            if(s.charAt(j) == '1'){
                mid_zero += j - i - 1;
                i = j; }
            }
        if(i == 0) return s.length() - 1;
            
        return mid_zero + 1 + s.length();
    }
}