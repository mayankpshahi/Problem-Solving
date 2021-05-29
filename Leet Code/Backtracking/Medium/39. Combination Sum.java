
//39. Combination Sum

class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
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
            subset.add(nums[i]);
            
            backtrack(res, subset, nums, target - nums[i], i); 
            
            subset.remove(subset.size() - 1);
        }
    
    return;
        
    }
}