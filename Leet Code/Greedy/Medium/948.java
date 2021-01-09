//948. Bag of Tokens

class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        if(tokens.length==1 && tokens[0]>P) return 0;
        Arrays.sort(tokens);
        int ans = 0;
         int count = 0;
        int start = 0,end=tokens.length-1;
        while(start<=end){
            if(P>=tokens[start]){
                P-=tokens[start];
                 count++;
                if(count>ans)ans=count;
                 start++;
            }else if(count>0){
                P+=tokens[end];
                count--;
                end--;
                
            }else break;
        }
        
        return ans;
        
    }
}