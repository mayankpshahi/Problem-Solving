
//1818. Minimum Absolute Sum Difference

class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n =  nums1.length;
        int diff [] =  new int[n];
        for(int i=0;i<n;i++){
            diff[i] =  Math.abs(nums1[i] - nums2[i]);
        }
        int maxind = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(diff[i]>max){
               max = diff[i];
               maxind = i;
           }
        }
        int minval = nums1[maxind];
        for(int i=0;i<n;i++){
            if(Math.abs(nums1[i] - nums2[maxind])<diff[maxind]){
                nums1[maxind] = nums1[i];
                diff[maxind] = Math.abs(nums1[maxind] - nums2[maxind]);
                }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=diff[i];
            sum%=1000000007;
        }
        
        return sum;
        
        
    }
}