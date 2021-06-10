




//1301. Number of Paths with Max Score


class Pair{
    int val;
    long paths;
    Pair(int val, long paths){
        this.val = val;
        this.paths = paths;
    }
}
class Solution {
    static int mod = (int)Math.pow(10, 9) + 7;
   static Pair[][] dp;
    public static Pair fn(List<String> arr, int i, int j){
        if(i == 0 && j == 0) return new Pair(0, 1);
        
        if(i < 0 || j < 0 || arr.get(i).charAt(j) == 'X') return new Pair(Integer.MIN_VALUE, 0);
        
        if(dp[i][j] != null) return dp[i][j];
        
        int curr = 0;
        
        if(arr.get(i).charAt(j) != 'S') curr = (arr.get(i).charAt(j)) - '0';
        
        Pair count1 = fn(arr,i - 1, j);
        Pair count2 = fn(arr, i, j - 1);
        Pair count3 = fn(arr, i - 1, j - 1);
        
        Pair max = new Pair(Integer.MIN_VALUE, 0);
        
        if(count1.val != Integer.MIN_VALUE) max = new Pair(count1.val, count1.paths); 
        
        if(count2.val != Integer.MIN_VALUE){
            if(count2.val > max.val) max = new Pair(count2.val, count2.paths);
            else if(count2.val == max.val) max = new Pair(max.val, (max.paths + count2.paths) % mod);
        }
        if(count3.val != Integer.MIN_VALUE){
            if(count3.val > max.val) max = new Pair(count3.val, count3.paths);
            else if(count3.val == max.val) max = new Pair(max.val, (max.paths + count3.paths) % mod);
        } 
        
        if(max.val != Integer.MIN_VALUE) max.val += curr;
        
        return dp[i][j] = max;
    }
    
    public int[] pathsWithMaxScore(List<String> board) {
         int n = board.size();
        dp = new Pair[n][n];
        Pair res = fn(board, n - 1, n - 1);
        if(res.val == Integer.MIN_VALUE) return new int[2];
        int[] ans = new int[2];
        ans[0] = res.val;
        ans[1] = (int)res.paths;
        return ans;
        
    }
}