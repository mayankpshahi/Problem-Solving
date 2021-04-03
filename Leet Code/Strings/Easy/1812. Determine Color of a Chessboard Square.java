


//1812. Determine Color of a Chessboard Square

class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c [] = coordinates.toCharArray();
        
        int i = Integer.parseInt(String.valueOf(c[0]-'a' + 1));
        int j = Integer.parseInt(String.valueOf(c[1]));
        
       
        
        if(i%2==0 && j%2==0) return false;
        else if(i%2!=0 && j%2!=0) return false;
        else return true;
        
    }
}