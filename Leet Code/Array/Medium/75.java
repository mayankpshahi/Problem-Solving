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
            int last = nums.length-1;
            int first = 0;
            moveElementToLast(nums,first,last,2); // first move 2s to last
            while(last >= 0 && nums[last] == 2)  // get the last 2 position
                last--;
            first = 0;
            moveElementToLast(nums,first,last,1); // move 1s to before the last 2's position
        }
    }
    private void moveElementToLast(int[] nums, int first, int last, int num){
        while(first <= last){
            if(nums[first] == num){
                if(nums[last] == num)
                    last--;
                else{
                    int temp = nums[last];
                    nums[last] = nums[first];
                    nums[first] = temp;
                    first++;
                    last--;
                }
            }else{
                first++;
            }
        }
    }
}
