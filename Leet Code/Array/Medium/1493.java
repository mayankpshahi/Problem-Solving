//1493. Longest Subarray of 1's After Deleting One Element

//O(n)
class Solution {
    public int longestSubarray(int[] nums) {
         int withDel = 0;
        int withOutDel = 0;
        int maxlen = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                withDel = withOutDel;
                withOutDel = 0;
            }
            else{
                withDel++;
                withOutDel++;
            }
            maxlen = Math.max(maxlen, withDel);
        }

        return maxlen != nums.length ? maxlen : maxlen - 1;

    }
}

//Same logic another way
class Solution {
    public int longestSubarray(int[] nums) {
         int prev = 0;
        int curr = 0;
        int max = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 1){
                curr++;
                if(curr + prev > max) max = curr + prev;
            }
            else if(nums[i] == 0){
                prev = curr;
                curr = 0;
            }
        }
        if(max == nums.length) return max - 1;
        else return max;

    }
}
