


//Min Cost Path






public class Solution {
    static class triplet{
int i;
int j;
int cost;

    public triplet(int i, int j, int cost) {
        this.i = i;
        this.j = j;
        this.cost = cost;
    }
}
public int solve(int A, int B, ArrayList<String> C) {
    
    int rows = C.size();
    int col = C.get(0).length();



    Deque<triplet> deque = new LinkedList<>();
    // Set<String> visited = new HashSet<>(); //gives TLE
    int[][] visited = new int[rows][col];
    deque.add(new triplet(0,0, 0));

    
    int[] dirx = {0,0,1, -1};
    int[] diry = {1,-1, 0, 0};
    while (!deque.isEmpty()){
        triplet t = deque.pollFirst();
        // visited.add(t.i+" " +t.j);
        visited[t.i][t.j] = 1;
        if(t.i == rows-1 && t.j == col-1)return t.cost;
        for(int i =0; i < 4; i++){
            char c = C.get(t.i).charAt(t.j);
            int nexti = t.i + dirx[i];
            int nextj = t.j + diry[i];
            if(nexti <0 || nextj <0 || nexti>=rows || nextj>=col)continue;
            if(visited[nexti][nextj] == 1)continue;
            int cost = 0;
            if(c == 'L' && dirx[i] ==0 && diry[i] ==-1) cost=0;
            else if (c == 'U' && dirx[i] ==-1 && diry[i] ==0)cost =0;
            else if (c == 'D' && dirx[i] ==1 && diry[i] ==0)cost=0;
            else if (c == 'R' && dirx[i] ==0 && diry[i] ==1) cost=0;
            else cost =1;
            if(cost==1){
                deque.addLast(new triplet(nexti,nextj, t.cost+cost));
            }else {
                deque.addFirst(new triplet(nexti,nextj, t.cost+cost));
            }



        }



    }
    return -1;
    
    
}
}
