



//79. Word Search


class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word){ 
        
        visited = new boolean[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j] && backtrack(i,j,0,board,word))
                    return true;
            }
        }
        
        return false;
    }
    private boolean backtrack(int i,int j,int ind,char[][] board, String word){
        
        if(ind == word.length())return true;
        
        
         if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(ind)!=board[i][j] || visited[i][j]){
           return false;  
         }
        
        visited[i][j] = true;
        
        if(backtrack(i+1,j,ind+1,board,word)||
             backtrack(i-1,j,ind+1,board,word)||
             backtrack(i,j+1,ind+1,board,word)||
             backtrack(i,j-1,ind+1,board,word)){
            return true;
        }
        
        visited[i][j] = false;
        
        return false;
    }
}