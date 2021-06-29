



//Cycle in Undirected Graph




 public class Solution {
public int solve(int A, int[][] B) {
boolean vis[]=new boolean[A];
ArrayList g[]=new ArrayList[A];
for(int i=0;i<A;i++)
{
g[i]=new ArrayList();
}
for(int i=0;i<B.length;i++)
{
g[B[i][0]-1].add(B[i][1]-1);
g[B[i][1]-1].add(B[i][0]-1);
}
for(int i=0;i<A;i++){
if(!vis[i])
{
boolean iscycle=dfs(g,vis,i,A,-1);
if(iscycle)
return 1;
}
}
return 0;
}
public boolean dfs(ArrayList<Integer> g[],boolean vis[],int i,int A,int p){
    vis[i]=true;
    boolean res=false;
    for(int j=0;j<g[i].size();j++)
    {
        int in = g[i].get(j);
        if(vis[in] && p!=in)
        return true;
        if(!vis[in])
        {
            res = res || dfs(g,vis,in,A,i);
        }
    }
    return res;
}
} 