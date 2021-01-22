
//1539. Kth Missing Positive Number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        
         Map<Integer,Integer> m=new HashMap<>();
          Set<Integer>s=new HashSet<>();
        
        int max=arr[arr.length-1];
        for(int ele : arr)
        {
            s.add(ele);
        }
        
        int i=1;
        for(int ele=1;ele<=max+k;ele++)
        {
           if(!s.contains(ele))
           {
               m.put(i,ele);
               i++;
           }
        }
        return m.get(k);
        
    }
}