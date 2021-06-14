


//Smaller or equal elements



public class Solution {
    public int solve(int[] A, int B) {
        int left = 0,right = A.length-1;
        int count=0;
        while(left<=right){
            int mid = (right-left)/2 + left;
            if(A[mid] > B){
                right = mid-1;
            }
            else{
                count += mid-left+1;
                left = mid+1;
            }
        }
        
        return count;
    }
}
