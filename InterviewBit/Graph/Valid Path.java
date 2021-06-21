


//Valid Path






public class Solution {
    int A,B;
    int[] centerX;
    int[] centerY;
    boolean[][] visited;
    int[] dx={0,1, 0,-1,1,-1,+1,-1};//{0, 0, 1,-1, 1, -1, 1, -1};
    int[] dy={1,0,-1, 0,1,-1,-1,+1};//{1,-1, 0, 0, 1, -1, -1, 1};
    int n, R;
    public String solve(int A, int B, int n, int R, int[] centerX, int[] centerY) {
        this.A=A;
        this.B=B;
        visited=new boolean[A+1][B+1];
        this.centerX=centerX;
        this.centerY=centerY;
        this.n=n;
        this.R=R;
        return DFS(0,0) ? "YES" : "NO";
    }
    private boolean DFS(int x, int y){
        if(isInvalid(x,y)){
            return false;
        }
        if(x==A && y==B) return true;
        visited[x][y]=true;
        
        for(int i=0;i<8;i++){
            int nextX=x+dx[i];
            int nextY=y+dy[i];
            if(DFS(nextX,nextY)){
                return true;
            }
        }
        return false;
    }
    private boolean isInvalid(int x, int y){
        if(x<0 || x>A || y<0 || y>B || visited[x][y] || inCircle(x,y)){
            return true;
        }
        return false;
    }
    private boolean inCircle(int x, int y){
        for(int i=0;i<n;i++){
            int cx = centerX[i];
            int cy = centerY[i];
            if(((x-cx)*(x-cx) + (y-cy)*(y-cy))<=R*R){
                return true;
            }
        }
        return false;
    }
}