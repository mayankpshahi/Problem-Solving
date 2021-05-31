


//60. Permutation Sequence

class Solution {
    public String getPermutation(int n, int k) {
        
        ArrayList<String> res = new ArrayList<>();
    
    backtrack(res,"",n,k,new boolean[n+1]);
    
    return res.get(k-1);
        
    }
     private void backtrack(ArrayList<String> res, String s, int max, int k, boolean[] seen){
        
        if(s.length()==max){
            res.add(new String(s));
            return;
        }else{
            for(int i =1;i<=max;i++){
                if(res.size()==k)break;
                if(seen[i]) continue;
                seen[i] =true;
                
                backtrack(res,s+i,max,k,seen);
                seen[i] = false;
            }
        }
}
}