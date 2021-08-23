


//wallsAndGates
https://leetfree.com/problems/walls-and-gates





//DFS


public void wallsAndGates(int[][] rooms) {
    if(rooms==null || rooms.length==0||rooms[0].length==0)
        return;
 
    int m = rooms.length;
    int n = rooms[0].length;
 
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(rooms[i][j]==0){
                dfs(rooms, i, j, 0);
            }
        }
    }
}
 
public void dfs(int[][] rooms, int i, int j, int sum){
    int m=rooms.length;
    int n=rooms[0].length;
 
    if(i<0||i>=m||j<0||j>=n||rooms[i][j]<sum){
        return;
    }
 
    rooms[i][j] = sum;
 
    dfs(rooms, i-1, j, sum+1);
    dfs(rooms, i, j+1, sum+1);
    dfs(rooms, i+1, j, sum+1);
    dfs(rooms, i, j-1, sum+1);
}



//BFS



public void wallsAndGates(int[][] rooms) {
    if(rooms==null || rooms.length==0||rooms[0].length==0)
        return;
 
    int m = rooms.length;
    int n = rooms[0].length;
 
    Queue<Pair<Integer,Integer>> queue = new LinkedList<Pair<Integer,Integer>>();
 
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(rooms[i][j]==0){
                queue.add(new Pair<>(i,j));
            }
        }
    }
 
    while(!queue.isEmpty()){
        int room = queue.poll();
        int i=room.getKey();
        int j=room.getValue();
 
        if(i>0 && rooms[i-1][j]==Integer.MAX_VALUE){
            rooms[i-1][j]=rooms[i][j]+1;
            queue.add(new Pair<>(i-1,j));
        }
 
        if(i<m-1 && rooms[i+1][j]==Integer.MAX_VALUE){
            rooms[i+1][j]=rooms[i][j]+1;
            queue.add(new Pair<>(i+1,j));
        }
 
        if(j>0 && rooms[i][j-1]==Integer.MAX_VALUE){
            rooms[i][j-1]=rooms[i][j]+1;
            queue.add(new Pair<>(i,j-1));
        }
 
        if(j<n-1 && rooms[i][j+1]==Integer.MAX_VALUE){
            rooms[i][j+1]=rooms[i][j]+1;
            queue.add(new Pair<>(i,j+1));
        }
    }
}