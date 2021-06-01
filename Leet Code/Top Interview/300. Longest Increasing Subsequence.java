







//300. Longest Increasing Subsequence


class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)return 0;
        
        return lisFind( nums );
        
    }
    private int lisFind( int arr[] )
    {
        int n =  arr.length;
        int i, j;
 
        /* Allocate memory for LIS[] and initialize LIS values as 1 for
            all indexes */
        int[] lisarr = new int[n];
        for (i = 0; i < n; i++)
            lisarr[i] = 1;
 
        /* Compute LIS values from left to right */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lisarr[i] < lisarr[j] + 1)
                    lisarr[i] = lisarr[j] + 1;
 
       return Arrays.stream(lisarr).max().getAsInt();
 
       // return lisarr.length;
    }
}