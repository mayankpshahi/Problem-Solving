//657. Robot Return to Origin


//O(n)
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0 ,y = 0;
        for(int  i = 0;i<moves.length();i++){
            if(moves.charAt(i) == 'U')
                y++;
            else if(moves.charAt(i)=='D')
                y--;
            else if(moves.charAt(i)=='L')
                x--;
            else if(moves.charAt(i)=='R')
                x++;
                
        }
        if(x == 0 && y==0)
            return true;
        else
            return false;
        
    }
}

//Best Solution
class Solution {
    public boolean judgeCircle(String moves) {
       int res = 0;
       int[] m = new int[100];
        m['L'] = -1;
        m['R'] = 1;
        m['U'] = 9;
        m['D'] = -9;
        
        for(char c : moves.toCharArray()){
            res += m[c];
        }
        
        return res == 0;
        
    }
}