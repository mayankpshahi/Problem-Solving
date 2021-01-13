//1689. Partitioning Into Minimum Number Of Deci-Binary Numbers



class Solution {
    public int minPartitions(String n) {
        
         int count = 0;
        for (int i = 0; i < n.length(); ++i)
            count = Math.max(count, n.charAt(i) - '0');
        
        return count;
        
    }
}