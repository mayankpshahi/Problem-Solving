//33. Search in Rotated Sorted Array

class Solution {
    static int findIndex(int[]arr,int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[left] <= arr[mid]){
            if(target >= arr[left] && target <= arr[mid]){
                return findIndex(arr,left,mid-1,target);
            }
            return findIndex(arr,mid+1,right,target);
        }
         if(target >= arr[mid] && target <= arr[right]){
             return findIndex(arr,mid+1,right,target);
         }
        
        return findIndex(arr,left,mid-1,target);
    }
    
    public int search(int[] nums, int target) {
        int i = findIndex(nums,0,nums.length-1,target);
        return i;
        
    }
}