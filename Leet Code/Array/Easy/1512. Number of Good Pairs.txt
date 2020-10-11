My Solution - O(n^2)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        for(int i=0;i<nums.length - 1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
        
    }
}

Other Solution HashMap - O(n)

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:nums){
            Integer s = map.get(num);
            if(s==null){
                map.put(num,1);
            }
            else{
                map.put(num,s+1);
            }
        }
        
        int good_pair = 0;
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            good_pair += e.getValue()*(e.getValue() - 1)/2; 
        }
        
        return good_pair;
    }
}