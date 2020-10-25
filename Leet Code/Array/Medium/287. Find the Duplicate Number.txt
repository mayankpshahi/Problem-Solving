//287. Find the Duplicate Number

//1ms solution
class Solution {
    public int findDuplicate(int[] nums) {
        int freq[] = new int[nums.length];
        int dup = 0;
        for(int i=0;i<nums.length;i++)
            freq[nums[i]]++;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                dup = i;
                break;
            }


        }
        return dup;

    }
}

//0ms Solution
class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast)
                break;
        }
        int ptr1 = nums[0];
        int ptr2 = slow;
        while (ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
}
