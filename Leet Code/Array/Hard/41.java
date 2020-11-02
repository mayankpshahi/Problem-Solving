//41. First Missing Positive

//O(n) Solution

class Solution {
    public int firstMissingPositive(int[] nums) {
        int freq[] = new int[301];
        for(int x : nums)
            if(x>=0 && x<301)
                freq[x] = 1;
        for(int i=1;i<301;i++)
            if(freq[i]!=1)
                return i;

        return 301;

    }
}
