   
//448. Find All Numbers Disappeared in an Array

   class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        
        for (int i : nums) {
            int ind = Math.abs(i);
            if (nums[ind - 1] > 0) {
                nums[ind - 1] *= -1;
            }
        }
        
        for (int i = 0; i < nums.length; i++)
            if (nums[i] >0) 
                l.add(i+1);
            
        
    return l;
        
        
    }
}