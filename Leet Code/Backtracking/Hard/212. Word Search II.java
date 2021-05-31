


//212. Word Search II

class Solution {
     
    public List<String> findWords(char[][] board, String[] words) {
        
        Set<String> res = new HashSet<>();
        
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                for(String word : words) {
                if(word.charAt(0)==board[i][j] && backtrack(i,j,0,board,word,new boolean[board.length][board[0].length]))
                    res.add(word);
                    
                }
            }
        }
        
        return new ArrayList<>(res);
        
    }
    private boolean backtrack(int i,int j,int ind,char[][] board, String word,boolean visited[][]){
        
        if(ind == word.length())return true;
        
        
         if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(ind)!=board[i][j] || visited[i][j]){
           return false;  
         }
        
        visited[i][j] = true;
        
        if(backtrack(i+1,j,ind+1,board,word,visited)||
             backtrack(i-1,j,ind+1,board,word,visited)||
             backtrack(i,j+1,ind+1,board,word,visited)||
             backtrack(i,j-1,ind+1,board,word,visited)){
            return true;
        }
        
        visited[i][j] = false;
        
        return false;
    }
}