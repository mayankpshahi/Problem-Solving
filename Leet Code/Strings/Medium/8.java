//8. String to Integer (atoi)


//O(n)
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) 
            return 0;
         int sign = 1; int i = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+'){
    	sign = (s.charAt(0) == '-')? -1 : 1;
    	if (s.length() < 2 || !Character.isDigit(s.charAt(1))) {
    		return 0;
    	}
    	i++;
     }
        int num  = 0;
        while (i < s.length()) {
    	if (Character.isDigit(s.charAt(i))) {
    		int d = s.charAt(i) - '0';
    		if (num > (Integer.MAX_VALUE - d) / 10) {
    			num = (sign == -1)? Integer.MIN_VALUE : Integer.MAX_VALUE;
    			return num;
    		}
    		num = num*10 + d;
    	} else {
    		break;
    	}
    	i++;
    }
        return sign*num;
        
        
        
        
        
    }
}