//88. Merge Sorted Array


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = m+n-1;
        int first = m-1;
        int second = n-1;
        while(first >= 0 || second >= 0){
            int num1 = first >= 0 ? nums1[first] : Integer.MIN_VALUE;
            int num2 = second >= 0 ? nums2[second] : Integer.MIN_VALUE;
            if(num1 > num2){
                nums1[ind] = num1;
                first--;
            }else{
                nums1[ind] = num2;
                second--;
            }
            ind--;
        }
        
    }
}