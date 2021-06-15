


//Matrix Median

public class Solution {
    public int findMedian(int[][] arr) {
        int m = arr.length, n = arr[0].length;
    int min = 0, max = 0;
    
    for(int i=0; i<m; i++){
        
        min = Math.min(min, arr[i][0]);
        max = Math.max(max, arr[i][n-1]);
    }
    
    int median = (1 + m * n) / 2;
    
    while(min < max){
        
        int mid = min + (max - min)/2;
        
        int count = 0, get = 0;
        
        for(int i=0; i<m; i++){
            
            get = Arrays.binarySearch(arr[i], mid);
            
            if(get < 0){
                get = Math.abs(get) - 1;
            }
            else{
                while(get < n && arr[i][get] == mid)
                    get++;
            }
            
            count = count + get;
        }
        
        if(count < median)
            min = mid + 1;
        else 
            max = mid;
    }
    
    return min;
    }
}
