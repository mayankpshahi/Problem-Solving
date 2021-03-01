
//575. Distribute Candies

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s =  new HashSet<Integer>();
        for(int i : candyType) s.add(i);
        
        return s.size()>=(candyType.length/2)?(candyType.length/2):s.size();
        
    }
}