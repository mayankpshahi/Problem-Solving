//53. Maximum Subarray

//O(nlogn)

class Solution {
    static int maxSum(int arr[],int left,int mid,int right){
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = mid; i >= left; i--)
        {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }

        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= right; i++)
        {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }

        return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));



    }


    static int maxSubArraySum(int arr[], int left,
                                      int right)
    {

    if (left == right)
        return arr[left];


    int mid = (left + right)/2;


    return Math.max(Math.max(maxSubArraySum(arr, left, mid),
                    maxSubArraySum(arr, mid+1, right)),
                    maxSum(arr, left, mid, right));
    }


    public int maxSubArray(int[] nums) {
        int max = maxSubArraySum(nums,0,nums.length-1);

        return max;

    }
}




//O(n) time

class Solution {

    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0){
                nums[i]+=nums[i-1];}
            sum=Math.max(nums[i],sum);
        }
        return sum;

    }
}


//More precise implementation of kadane's algo

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int store = nums[0], max = nums[0];
        int z = 0;
        //Kadane Algorithm
        for(int x : nums){
            if(z == 0) {
                z++;
                continue;
            }
            //keep adding while its not negative sum
            if(store >= 0){
                store += x;
            }
            //reinitialize
            else {
                store = x;
            }
            max = Math.max(max,store);
        }
        return max;
    }
}
