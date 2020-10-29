//456. 132 Pattern

//O(n^2)

class Solution {
    public boolean find132pattern(int[] nums) {

        int leftmin = nums[0];
        for(int j =1;j<nums.length-1;j++){
            for(int k =j+1;k<nums.length;k++){
            if((nums[k]>leftmin) && (nums[k]<nums[j])){
                return true;
            }}
            leftmin = Math.min(nums[j],leftmin);
        }
        return false;

    }
}

//O(n) 3ms

class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] minarr = new int[n];
        minarr[0] = nums[0];
        for(int i = 1; i < n; i++)
            minarr[i] = Math.min(minarr[i - 1], nums[i]);

        Stack < Integer > s = new Stack < > ();
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > minarr[j]) {
                while (!s.isEmpty() && s.peek() <= minarr[j])
                    s.pop();
                if (!s.isEmpty() && s.peek() < nums[j])
                    return true;
                s.push(nums[j]);
            }
        }
        return false;

    }
}
