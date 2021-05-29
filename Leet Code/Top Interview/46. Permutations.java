
//46. Permutations

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
    
    backtrack(res, new ArrayList<>(), nums);
    return res;
        
    }
private void backtrack(List<List<Integer>> res, List<Integer> subset, int [] nums){
      
        if (subset.size()==nums.length){
            res.add(new ArrayList<>(subset));
        }
        
    
    
        for(int i = 0; i < nums.length; i++){
            if(!subset.contains(nums[i])){
            subset.add(nums[i]);
            
            backtrack(res, subset, nums); 
            
            subset.remove(subset.size() - 1);
            }
        }
    
    return;
        
    }
}