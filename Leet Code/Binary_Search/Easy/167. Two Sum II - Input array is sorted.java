
//167. Two Sum II - Input array is sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        for(int i = 0; i < numbers.length - 1; i++){
            int low = i + 1, high = numbers.length - 1, mid = low + (high - low)/2;
            while(low <= high){
                if(numbers[mid] == target - numbers[i]) return new int[]{i+1, mid+1};
                else if(numbers[mid] < target - numbers[i]) low = mid + 1;
                else high = mid - 1;
                mid = low + (high - low)/2;
            }
        }
        
        return new int[]{};
        
    }
}