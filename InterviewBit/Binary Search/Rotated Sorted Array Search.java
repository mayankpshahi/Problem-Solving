




//Rotated Sorted Array Search



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int i = findIndex(A,0,A.length-1,B);
        return i;
        
    }
   private int findIndex(int[]arr,int left,int right,int target){
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
}
