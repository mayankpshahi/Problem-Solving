


//131. Palindrome Partitioning

class Solution {
    public List<List<String>> partition(String s) {
        if(s == null || s.length() == 0) return new ArrayList<>();
        
         List<List<String>> res  =  new  ArrayList<>();
         
         backtrack(res, new ArrayList<>(), s);
         return res;
        
    }
     public void backtrack(List<List<String>> res,ArrayList<String> subset,String s){
        
           if(s == null || s.length() == 0) {
            res.add(new ArrayList<>(subset));
            return;
        }
               
        
        for(int i=1;i<=s.length();i++){
            String curr = s.substring(0,i);
            if(isPalindrome(curr)){
                subset.add(curr);
                backtrack(res,subset,s.substring(i,s.length()));
                subset.remove(subset.size() - 1);
                
            }
        }
        
        
        
        
    }
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left ++;
            right --;
        }
        return true;
    }
}