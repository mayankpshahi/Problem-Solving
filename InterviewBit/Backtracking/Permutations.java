

//Permutations

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
         ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    
    backtrack(res, new ArrayList<>(),A);
    return res;
    }
    private void backtrack(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subset, ArrayList<Integer> A){
      
        if (subset.size()==A.size()){
            res.add(new ArrayList<>(subset));
        }
        
    
    
        for(int i = 0; i < A.size(); i++){
            if(!subset.contains(A.get(i))){
            subset.add(A.get(i));
            
            backtrack(res, subset, A); 
            
            subset.remove(subset.size() - 1);
            }
        }
    
    return;
        
    }
}
