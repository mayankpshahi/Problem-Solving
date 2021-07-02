



//Largest Distance between nodes of a Tree





public class Solution {
    int max=0;
    public int solve(ArrayList<Integer> A) {
        List<List<Integer>> al=new ArrayList<>();
        int n=A.size();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        int root=0;
        for(int i=0;i<n;i++)
        {
            if(A.get(i)==-1){
                root=i;
            }
            else{
                al.get(A.get(i)).add(i);
            }
        }
        findMaxDistance(al,root);


        return max;
    }
    
    
    
    public int findMaxDistance(List<List<Integer>> al,int u)
    {
        int curr=0;

        for(int v:al.get(u)){
            int dist=findMaxDistance(al,v);
            max=Math.max(max,curr+dist);
            curr=Math.max(dist,curr);
        }


        return (curr+1);
    }

}
