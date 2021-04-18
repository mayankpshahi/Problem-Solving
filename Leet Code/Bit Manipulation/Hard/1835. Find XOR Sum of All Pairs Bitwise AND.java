

//1835. Find XOR Sum of All Pairs Bitwise AND



class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        
        Map<Integer,Integer> map =  new HashMap<>();
        for(int i=0;(1<<i)<1000000000;i++){
            int p = (1<<i);
            for(int j=0;j<arr1.length;j++){
                if((p&arr1[j])>0) map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        
        Map<Integer,Integer> map2 =  new HashMap<>();
         for(int i=0;(1<<i)<1000000000;i++){
            int p = (1<<i);
            for(int j=0;j<arr2.length;j++){
                if((p&arr2[j])>0) map2.put(i,map2.getOrDefault(i,0)+1);
            }
        }
        
        long res = 0;
        for(int i=0;i<=32;i++){
            if(map.getOrDefault(i,0)%2 == 1 && map2.getOrDefault(i,0)%2 == 1) res+=(1<<i);
        }
        
        return (int)res;
    }
}




class Solution {
    
      public int getXORSum(int[] A, int[] B) {
        int xora = 0, xorb = 0;
        for (int a: A)
            xora ^= a;
        for (int b: B)
            xorb ^= b;
        return xora & xorb;
    }
   
}


