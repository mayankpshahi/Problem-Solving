
//1025. Divisor Game

//Linear Dp

//Recursive
class Solution {
    public boolean divisorGame(int n) {
        
        if (n==1) return false;
        if (n==2) return true;
        
        
        for (int i=1;i<=n;i++){
            if (n%i == 0)
                return !(divisorGame(n-i));
       }
        return false;
    }
}



