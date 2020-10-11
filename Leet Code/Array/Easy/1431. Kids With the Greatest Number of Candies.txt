class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> l = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(max<=candies[i] + extraCandies){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        
        return l;
        
    }
}