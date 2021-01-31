
//1742. Maximum Number of Balls in a Box

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int arr[]  =  new int[highLimit+1];
        
        for(int i = lowLimit;i<=highLimit;i++){
            int curr = i;
            int sum = 0;
            while(curr>=1){
                sum+=(curr%10);
                curr/=10;
            }
            arr[sum]++;
        }
        int max = arr[0];
        for(int i=1;i<highLimit+1;i++)
        {
            max =  Math.max(arr[i],max);
            
        }
        
        return max;
        
    }
}