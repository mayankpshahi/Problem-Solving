//927. Three Equal Parts


class Solution {
    public int[] threeEqualParts(int[] A) {
        int count1 = 0;
        for(int a:A)
            if(a==1)count1++;
        
        if(count1 == 0)      
            return new int[]{0, A.length-1};
        
        if(count1 % 3 != 0)            
            return new int[]{-1, -1};
        
        int k = count1/3;
        
        int start, mid, end;
        start = mid = end = -1;
        count1 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                continue;
            count1++;
            if (start == -1)
                start = i;
            else if (k + 1 == count1)
                mid = i;
            else if (2 * k + 1 == count1)
                end = i;
        }
        
        while (end < A.length && A[start] == A[mid] && A[mid] == A[end]) {
            start++;
            mid++;
            end++;
        }
        
        if (end == A.length)
            return new int[]{start - 1 , mid};
        
        return new int[]{-1, -1};
        
        
        
    }
}