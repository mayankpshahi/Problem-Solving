//260. Single Number III

//O(n)

class Solution {
    public int[] singleNumber(int[] nums) {
        int numboth = 0;
        for(int n:nums) numboth^=n;
        int least = numboth & -numboth;
        int x = 0;
        for(int n:nums){
            if((least & n)!=0) x^=n;

        }
        return new int[]{x,numboth^x};

    }
}
