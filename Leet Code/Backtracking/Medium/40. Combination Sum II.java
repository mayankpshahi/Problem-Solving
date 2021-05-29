

//40. Combination Sum II




class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(res, new ArrayList<>(), nums, target, 0);
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
            
            backtrack(res, subset, nums, target - nums[i], i+1); 
            
            subset.remove(subset.size() - 1);
            }
        }
    
    return;
        
    }
}