//Letter Phone



public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        
         if (digits.length() == 0) return new ArrayList<>();
        
    String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
    ArrayList<String> res =  new ArrayList<>();
    backtrack(res,digits.toCharArray(),"",map);
        
    return res;
    }
     public void backtrack(ArrayList<String> res,char []digits,String s,String [] map){
        
           if (digits.length==s.length()){
            res.add(s);
               
            return;
        }
          int i = s.length();
        int digit = digits[i] - '0';
        
        for (char let : map[digit].toCharArray()) {
            backtrack(res, digits, s + Character.toString(let), map);
        }
        
        
        
        
    }
}