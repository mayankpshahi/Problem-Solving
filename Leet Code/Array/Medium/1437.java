//1437. Check If All 1's Are at Least Length K Places Away

//O(n)

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int first = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                if(first == -1) first = i;
                else if(i - first - 1 < k) return false;
                else first = i;
            }

        }
        return true;

    }
}
