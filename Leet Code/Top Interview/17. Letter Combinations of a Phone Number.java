
//17. Letter Combinations of a Phone Number


class Solution {
    public List<String> letterCombinations(String digits) {
    if (digits.length() == 0) return new ArrayList<>();
        
    String[] map = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
    List<String> res =  new ArrayList<>();
    backtrack(res,digits.toCharArray(),"",map);
        
    return res;
        
    }
    public void backtrack(List<String> res,char []digits,String s,String [] map){
        
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