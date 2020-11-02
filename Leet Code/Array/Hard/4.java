//4. Median of Two Sorted Arrays

//O(log(max(m,n)))
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a[] , b[];
        if(nums1.length<=nums2.length){
            a = nums1;
            b = nums2;
        }
        else{
            a = nums2;
            b = nums1;
        }
        int n = a.length;
        int m = b.length;

        int l = 0;
        int r = n;

        int left = (n+m+1)/2;
        int right = n+m - left;

        while(l<=r){
            int mid = (l+r)>>1;
            int leftXMax , rightXMin;
            int leftYMax , rightYMin;
            if(mid == 0)
                leftXMax = Integer.MIN_VALUE;
            else
                leftXMax = a[mid-1];

            if(mid == n)
                rightXMin = Integer.MAX_VALUE;
            else
                rightXMin = a[mid];

            int yLeft = left - mid;
            if(yLeft == 0)
                leftYMax = Integer.MIN_VALUE;
            else
                leftYMax = b[yLeft-1];

            int yRight = right - (n-mid);
            if(yRight == 0)
                rightYMin = Integer.MAX_VALUE;
            else
                rightYMin = b[yLeft];


            if(leftXMax <= rightYMin && leftYMax <= rightXMin){
                if((n+m)%2 == 0){
                    return (Math.max(leftXMax , leftYMax) + Math.min(rightXMin , rightYMin))/2.0;
                }
                else{
                    return Math.max(leftXMax , leftYMax);
                }
            }

            else if(leftXMax > rightYMin){
                r = mid-1;
            }
            else
                l = mid+1;

        }
        return 0;


    }
}
