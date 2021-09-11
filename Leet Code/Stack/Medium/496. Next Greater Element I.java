


//496. Next Greater Element I



class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nextgreater[] =  new int[nums2.length];
        Arrays.fill(nextgreater,-1);
        int res[] =  new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                    nextgreater[i]=nums2[j];
                    break;
                }
            }
        }
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res[i]=nextgreater[j];
                    break;
                }
            }
        }
        
        return res;
        
    }
}





// O(n)


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st  = new Stack<>();
        
        
       for(int num:nums2){
           while(!st.isEmpty() && st.peek()<num) map.put(st.pop(),num);
           
           st.push(num);
       }
        
        for(int i=0;i<nums1.length;i++){
          nums1[i] =  map.getOrDefault(nums1[i],-1);
        }
        
        return nums1;
        
    }
}