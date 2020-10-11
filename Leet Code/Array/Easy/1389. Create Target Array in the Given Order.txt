My Solution

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int[nums.length];
        int t;
        int p;
        for(int i =0;i<nums.length;i++){
            if(target[index[i]]==0){
            target[index[i]] = nums[i];}
            else{
                t = target[index[i]];
                target[index[i]] = nums[i];
                for(int j = index[i]+1;j<nums.length;j++){
                    p = target[j];
                    target[j] = t;
                    t=p;
                }
                
            }
        }
        return target;
    }
}

My Optimized Best Solution:

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l  = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        int [] target = new int[nums.length];
        int i =0;
        for(int t : l){
            target[i++] = t;
        }
        
        return target;
    }
}