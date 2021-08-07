



//1958. Check if Move is Legal




class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        
        int m = board.length,n=board[0].length,x=rMove,y=cMove;
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1},{-1,1},{1,-1},{-1,-1},{1,1}};
        
        for(int d[]:dir){
            int dx= x+d[0];
            int dy = y+d[1];
            
            char c = color=='B'?'W':'B';
            if(dx>=0 && dx<=m-1 && dy>=0 && dy<=n-1){
                if(board[dx][dy]!=c)continue;
                boolean flag = dfs(board,d,dx,dy,m,n,color);
                if(flag)return true;
            }
        }
        
        return false;
        
        
        
    }
    private boolean dfs(char[][] board, int d[],int x, int y, int m, int n,char color){
        
        while(true){
            x = x+d[0];
            y = y+ d[1];
            if(x<0 || x==m || y<0 || y==n)break;
            else if(board[x][y]==color)return true;
            else if(board[x][y]=='.')return false;
        }
        
        
        return false;
        
        
        
    }
}