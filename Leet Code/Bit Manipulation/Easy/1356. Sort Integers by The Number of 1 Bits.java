    
//1356. Sort Integers by The Number of 1 Bits



    class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] comp = new Integer[arr.length];
        for (int i = 0; i < comp.length; ++i)
            comp[i] = arr[i];
    
        Arrays.sort(comp, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < comp.length; ++i)
           arr[i] = comp[i];
        
        return arr;
        
    }
}

