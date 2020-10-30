
//561. Array Partition I

//O(nlogn)

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length - 1;i+=2)
            sum+=nums[i];

        return sum;

    }
}

//Best Solution


class Solution {
    public int arrayPairSum(int[] nums) {
       int sumCount = nums.length / 2;

        int[] counter = new int[20001];
        for (int num : nums) {
            counter[num + 10000] += 1;
        }

        int sum = 0;
        int i = 0;
        while (sumCount-- > 0) {
            while (counter[i] == 0) {
                i++;
            }
            sum += i - 10000;
            counter[i]--;
           while (counter[i] == 0) {
                i++;
            }
            counter[i]--;
        }
        return sum;

    }
}
