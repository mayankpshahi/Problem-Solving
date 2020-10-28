//229. Majority Element II

//O(nlogn) 14ms using HashMap

class Solution {
    public List<Integer> majorityElement(int[] nums) {
            int major = nums.length/3;
        Set<Integer> num = new HashSet<Integer>();

        Map<Integer, Integer> m = new HashMap<>();

        for(int n: nums) {

            if(!m.containsKey(n)) {
                m.put(n, 1);
            } else {
                m.put(n, m.get(n)+1);
            }

            if(m.get(n) > major) {
                num.add(n);
            }
        }

        return new ArrayList(num);

    }
}



//O(n) 1ms Moore's Voting Algorithm

class Solution {
    public List<Integer> majorityElement(int[] nums) {
           int num1 = -1,num2 = -1,c1 = 0,c2=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == num1) c1++;
            else if(nums[i] == num2) c2++;
            else if(c1==0){
                num1 = nums[i];
                c1 =1;
            }
            else if(c2==0){
                num2 = nums[i];
                c2 =1;
            }else{
                c1--;
                c2--;
            }
        }
        List<Integer> numarr = new ArrayList<Integer>();
        c1=0;c2=0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == num1) c1++;
            else if(nums[i] == num2) c2++;
        }
        if(c1> nums.length/3) numarr.add(num1);
        if(c2> nums.length/3) numarr.add(num2);

        return numarr;

    }
}
