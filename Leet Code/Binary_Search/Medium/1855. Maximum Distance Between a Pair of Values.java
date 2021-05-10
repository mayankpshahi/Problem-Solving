

//1855. Maximum Distance Between a Pair of Values

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int ans =0,i=0;
        int n=nums1.length,m = nums2.length;
        
        
        for(int j=0;j<m;j++){
            while(i<n && nums1[i]>nums2[j]) i++;
            
            if(i==n)break;
            ans = Math.max(ans,j-i);
        }
        
        
        return ans;
        
    }
}