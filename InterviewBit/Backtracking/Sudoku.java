


//Sudoku


public class Solution {
    public void solveSudoku(ArrayList<ArrayList<Character>> board) {
        HashSet<String> set = new HashSet<>();  
        
       
        // add all existing numbers on board to set
        for(int row = 0; row <= 8; row++) {
            for(int col = 0; col <= 8; col++) {
                if(board.get(row).get(col) != '.') {
                    set.add(board.get(row).get(col) + " is found in row " + row);
                    set.add(board.get(row).get(col) + " is found in column " + col);
                    set.add(board.get(row).get(col) + " is found in sub-box " + row / 3 + "-" + col / 3); 
                }
            }
        }
        
        
         backtrack(board, set);
    }
    
     private boolean backtrack(ArrayList<ArrayList<Character>> board, HashSet<String> set) {        
        for(int row = 0; row <= 8; row++) {
            for(int col = 0; col <= 8; col++) {
                if(board.get(row).get(col) == '.') {
                    for(char num = '1'; num <= '9'; num++) {
                        // if num is already in row (or) col (or) in a sub-box, then continue!
                        if(set.contains(num + " is found in row " + row) || 
                        set.contains(num + " is found in column " + col) || 
                        set.contains(num + " is found in sub-box " + row / 3 + "-" + col / 3)) 
                            continue;

                        board.get(row).set(col,num);

                        set.add(board.get(row).get(col) + " is found in row " + row);
                        set.add(board.get(row).get(col) + " is found in column " + col);
                        set.add(board.get(row).get(col) + " is found in sub-box " + row / 3 + "-" + col / 3);

                        if(backtrack(board, set)) return true;
                            
                        set.remove(board.get(row).get(col) + " is found in row " + row);
                        set.remove(board.get(row).get(col) + " is found in column " + col);
                        set.remove(board.get(row).get(col) + " is found in sub-box " + row / 3 + "-" + col / 3);

                        board.get(row).set(col,'.');   
                    } 
                    return false;
                }
            }
        }
        return true;
    }
}
