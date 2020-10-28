//169. Majority Element

//O(nlogn) 13ms using HashMap

class Solution {
    public int majorityElement(int[] nums) {
        int major = nums.length/2;
        int num = -1;

        Map<Integer, Integer> m = new HashMap<>();

        for(int n: nums) {

            if(!m.containsKey(n)) {
                m.put(n, 1);
            } else {
                m.put(n, m.get(n)+1);
            }

            if(m.get(n) > major) {
                num = n;
            }
        }

        return num;

    }
}

//O(n) 1ms Moore's Voting Algorithm



class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for(int n : nums){
            if(count == 0) ele = n;

            if(n == ele) count++;
            else count--;
        }
        return  ele;


    }
}
