My Solution:

class SubrectangleQueries {
int [][]rect;
    public SubrectangleQueries(int[][] rectangle) {
        this.rect = rectangle;
        
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1;i<=row2;i++){
            for(int j = col1;j<=col2;j++){
                rect[i][j] = newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {
        return rect[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */


 Best Solution:

 class SubrectangleQueries {
int [][]rect;
    public SubrectangleQueries(int[][] rectangle) {
        this.rect = rectangle;
        
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        dfs(rect,row1,col1,row2,col2,newValue);
    }
    
    public int getValue(int row, int col) {
        return rect[row][col];
    }
     void dfs(int[][] rectangle, int row1, int col1, int row2, int col2, int value) {
        for(int i = row1; i <= row2; i++) {
            for(int j = col1; j <= col2; j++) {
                rectangle[i][j] = value;
            }
        }
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */