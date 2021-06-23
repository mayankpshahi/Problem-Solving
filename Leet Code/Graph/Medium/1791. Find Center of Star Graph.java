




//1791. Find Center of Star Graph



class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        
        for(int[]e:edges){
            if(set.contains(e[0])) return e[0];
            else set.add(e[0]);
            if(set.contains(e[1])) return e[1];
            else set.add(e[1]);
        }
        
        return -1;
        
    }
}




//Others Solution  - O(1)





public int findCenter(int[][] e) {
    return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
}