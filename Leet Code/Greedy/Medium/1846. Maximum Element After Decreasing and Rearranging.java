

//1846. Maximum Element After Decreasing and Rearranging

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        //arr[0]=1;
        int max = 1;
        for(int i=0;i<arr.length;i++){
            max =  Math.min(max,arr[i]);
            max++;
          
        }
        
        return --max;
        
    }
}