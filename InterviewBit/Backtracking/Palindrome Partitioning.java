


//Palindrome Partitioning


public class Solution {
    public ArrayList<ArrayList<String>> partition(String a) {
        
         if(a == null || a.length() == 0) return new ArrayList<>();
        
         ArrayList<ArrayList<String>> res  =  new  ArrayList<>();
         
         backtrack(res, new ArrayList<>(), a);
         return res;
        
    }
     public void backtrack(ArrayList<ArrayList<String>> res,ArrayList<String> subset,String s){
        
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
