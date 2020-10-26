My Solution:

class Solution {
    public int numTeams(int[] rating) {
        int count = 0;
        for(int i =1;i<rating.length;i++){
            int [] lessthan = new int[2];
            int [] greaterthan = new int[2];
            for(int j=0;j<rating.length;j++){
                if(rating[i]<rating[j])
                    ++lessthan[j>i?1:0];
                if(rating[i]>rating[j])
                    ++greaterthan[j>i?1:0];
            }
            count+= greaterthan[1]*lessthan[0] + lessthan[1]*greaterthan[0];
        }
        return count;
    }
}

Other solution1:

class Solution {
    public int numTeams(int[] rating) {
        if(rating == null || rating.length == 0){
            return 0;
        }
        
        int len = rating.length;
        int[] dp = new int[len];
        int count = 0;
        
        // first <r[i] <r[j] <r[k] order
        for(int i = 0; i < len; i++){
            for(int j = i; j >= 0; j--){
                if(rating[i] > rating[j]){
                    dp[i]++;
                    count = count + dp[j];
                }
            }
        }
        
        dp = new int[len];
        
        for(int i = 0; i < len; i++){
            for(int j = i; j >= 0; j--){
                if(rating[i] < rating[j]){
                    dp[i]++;
                    count = count + dp[j];
                }
            }
        }
        
        return count;
        
    }
}

