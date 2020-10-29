//560. Subarray Sum Equals K


//O(n) and O(1)

class Solution {
    public int subarraySum(int[] nums, int k) {
     int ans=0;
     long curr_sum=0l;
     HashMap<Long,Long> prev=new HashMap<Long,Long>();
     prev.put(0l,1l);
     for(int i=0;i<nums.length;i++)
     {
      curr_sum+=nums[i];
      if(prev.containsKey(curr_sum-k))
        ans+=prev.get(curr_sum-k);

      if(!prev.containsKey(curr_sum))
        prev.put(curr_sum,1l);
      else
        prev.put(curr_sum,prev.get(curr_sum)+1);
     }
    return ans;

    }
}
