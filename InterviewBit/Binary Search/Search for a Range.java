



//Search for a Range






public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
        
        int start = 0;
    int end = A.length-1;
    int []res = {-1,-1};
    while(start <= end) {
        int mid = (start+end)/2;
        int startPos = -1;
        int endPos = -1;
        if(A[mid] == B) {
            int k = mid;
            while(k-1 >= 0 && A[k-1] == B) {
                k--;
            }
             startPos = k;
            k = mid;
            while(k+1 <= A.length-1 && A[k+1] == B) {
                k++;
            }
             endPos = k;
            res[0] = startPos;
            res[1] = endPos;
            return res;
        } else if (A[mid] < B) start = mid+1;
        else end = mid-1;
    }
    return res;
    }
}
