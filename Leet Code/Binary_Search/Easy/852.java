//852. Peak Index in a Mountain Array

class Solution {
    static int binaryFind(int[]arr,int left,int right){
        int mid = (left+right)/2;
        if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
            return binaryFind(arr,mid+1,right);
        if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
            return binaryFind(arr,left,mid);
        if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            return mid;
        
        return mid;
    }
     
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r= arr.length-1;
        int peak = binaryFind(arr,l,r);
        
        return peak;
    }
}Q