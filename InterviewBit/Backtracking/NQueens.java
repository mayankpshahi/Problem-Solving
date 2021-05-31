

//NQueens


public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int n) {
        
         ArrayList<ArrayList<String>> res = new ArrayList<>();
         char[][] board = new char[n][n];
        for(char rows[] : board){
            Arrays.fill(rows,'.');
        }
        
        backtrack(n,0,new int[n], board, res);
        
        return res;
        
        
        
    }
    
    public void backtrack(int n,int ind,int[]occupied,char [][] board,ArrayList<ArrayList<String>> res){
        if(ind==n){
            ArrayList<String> rows =  new ArrayList<>();
            for(int i=0;i<n;i++){
                rows.add(String.valueOf(board[i]));
            }
            res.add(rows);
            return;
        }
        
        for (int i=0; i<n; i++) {
         if(isSafe(occupied,ind,i)){
             
               occupied[ind] = i;
                board[ind][i] = 'Q';
                backtrack(n, ind+1, occupied, board, res);
                board[ind][i] = '.';
             
         }   
            
            
            
        }
    }
        
     private boolean isSafe(int[] occupied, int prevRows, int colIndex) {
        for (int i=0; i<prevRows; i++) {
          
            if (occupied[i] == colIndex || Math.abs(colIndex - occupied[i]) == Math.abs(i - prevRows)){
                return false;
            }
        }
        return true;
    }
}
