//75. Sort Colors

//0ms O(n)

class Solution {
    public void sortColors(int[] nums) {
        int cnt0 = 0,cnt1 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                cnt0++;
            if(nums[i]==1)
                cnt1++;

        }

       for(int i=0;i<nums.length;i++){
           if(i<cnt0){
               nums[i] = 0;
           }
           else if(i>=cnt0 && i<(cnt0+cnt1)){
               nums[i] = 1;
           }
           else if(i>=(cnt0+cnt1) && i<nums.length){
               nums[i] = 2;
           }




       }



    }
}


//O(n)time O(1) space

class Solution {
    public void sortColors(int[] nums) {
        if(nums != null && nums.length > 0){
            int end = nums.length-1;
            int start = 0;
            moveToLast(nums,start,end,2);
            while(end >= 0 && nums[end] == 2)
                end--;
            start = 0;
            moveToLast(nums,start,end,1);
        }
    }
    static void moveToLast(int[] nums, int first, int last, int num){
        while(first <= last){
            if(nums[first] == num){
                if(nums[last] == num)
                    last--;
                else{
                    int t = nums[last];
                    nums[last] = nums[first];
                    nums[first] = t;
                    first++;
                    last--;
                }
            }else{
                first++;
            }
        }
    }
}
