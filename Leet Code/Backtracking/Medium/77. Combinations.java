
//77. Combinations


class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int nums [] = new int[n];
        for(int i=1;i<=n;i++) nums[i-1] =i;
        
    List<List<Integer>> res = new ArrayList<>();
    
    backtrack(res, new ArrayList<>(), nums, k, 0);
    return res;
        
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> subset, int [] nums, int target, int ind){
      if (target<=0){
        if (target==0){
            res.add(new ArrayList<>(subset));
        }
        return;
    }
    
        for(int i = ind; i < nums.length; i++){
            if(i<=ind || nums[i]!=nums[i-1]){
            subset.add(nums[i]);
            
            backtrack(res, subset, nums, target - 1, i+1); 
            
            subset.remove(subset.size() - 1);
            }
        }
    
    return;
        
    }
}