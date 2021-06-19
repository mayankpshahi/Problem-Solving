




//Single Number II


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        HashMap<Integer,Integer> map=new HashMap<>();
    int arr[]=new int[26];
    for(int i=0;i<A.length;i++) {
        int k=A[i];
        if(map.containsKey(k)) map.put(k,map.get(k)+1);
        else 
        map.put(k,1);
    }
    
      for (Map.Entry<Integer,Integer> entry : map.entrySet())  {
        
        if(entry.getValue()==1) return entry.getKey();
        else continue;
      }
        return -1;
    }
}
