
//268. Missing Number


class Solution {
    public int missingNumber(int[] nums) {
        int miss = nums.length;
        for (int i = 0; i < nums.length; i++) {
            miss ^= i ^ nums[i];
        }
        return miss;
    }
}


//HashSet Solution

class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> s  =  new HashSet<Integer>();
        for(int i : nums)
            s.add(i);
        
        int miss = -1;
        for(int i = 0;i<=nums.length;i++){
            if(!s.contains(i)){
                miss = i;
                break;
            }
        }
        
        return miss;
    }
}