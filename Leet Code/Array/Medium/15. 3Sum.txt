//15. 3Sum

//First and My Solution
//190ms Solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> threesum = new HashSet();
        if(nums.length<3)
            return new ArrayList(threesum);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length -1;
            while(j<k){
                int sum = nums[j] + nums[k];
                if(nums[i] + sum == 0){
                    List<Integer> l = new ArrayList();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    j++;
                    k--;
                    threesum.add(l);
                    }
                else if(nums[i] + sum > 0)
                    k--;
                else if(nums[i] + sum <0)
                    j++;
                }

        }
        return new ArrayList(threesum);

    }
}


//18ms fastest Solution
//Second Solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                List<List<Integer>> twos = twoSum(nums, i + 1, 0 - nums[i]);
                if (!twos.isEmpty()) {
                    for (List<Integer> two : twos) {
                        res.add(Arrays.asList(nums[i], two.get(0), two.get(1)));
                    }
                }
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] nums, int start, int target) {
        int end = nums.length - 1;
        List<List<Integer>> res = new ArrayList<>();
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[start++]);
                temp.add(nums[end--]);
                res.add(temp);
                while (start < end && nums[start] == nums[start - 1]) {
                    start++;
                }
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return res;
    }
}
