


//WoodCutting Made Easy!


public class Solution {
    public int solve(int[] A, int B) {
        int start = 0;
        int end = Arrays.stream(A).max().getAsInt();
        
        int res = -1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(isPossibleToCut(A, B, mid))
            {
                res = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return res;
        
    }
     boolean isPossibleToCut(int[] nums, int B, int currHeight)
    {
        long totalCur = 0;
        
        for(int num : nums)
        {
            totalCur += num > currHeight ? num - currHeight : 0; 
        }
        
        return totalCur >= B;
    }
}
