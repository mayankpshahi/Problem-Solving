//1. Two Sum

//O(n) 1ms

class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> m= new HashMap<>();
            for (int i = 0; i <nums.length; i++){
                if (m.containsKey(target - nums[i]))
                    return new int[]{m.get(target - nums[i]),i};
                else
                    m.put(nums[i], i);
			}
    return new int[2];
    }
}


//Fastest 0ms

class Solution {
 public int[] twoSum(int[] nums, int target) {
       int[] h=new int[2048];
        for (int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(h[c&2047]!=0){
                return new int[]{h[c&2047]-1,i};
            }
            h[nums[i]&2047]=i+1;
        }
        return null;
    }
}
