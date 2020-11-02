//1380. Lucky Numbers in a Matrix

//O(n^2) Solution

class Solution {
    private List<Integer> ans=new ArrayList<>();
    public List<Integer> luckyNumbers (int[][] a) {

        if (a==null||a.length==0)return ans;
        for (int i=0;i<a.length;i++){
            int min=a[i][0];int k=0;
            for (int j =0;j<a[0].length;j++){
                if (min>a[i][j]){
                    k=j;
                    min=a[i][j];
                }
            }
            maxcol(a,i,k);
        }
        return ans;
    }
    public void maxcol(int [][] a,int k,int j){
        int max=a[k][j];
        for (int i=0;i<a.length;i++){
            if (a[i][j]>max)return ;
        }
        ans.add(max);
    }
}
