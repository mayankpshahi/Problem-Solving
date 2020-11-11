//557. Reverse Words in a String III


//O(n)
class Solution {
    public String reverseWords(String s) {
        String str[]  = s.split(" ");
        s = "";
        StringBuilder rev;
        for(int i = 0;i<str.length-1;i++){
             rev = new StringBuilder(str[i]);
             s = s + rev.reverse()+" ";
            
            
        }
        rev = new StringBuilder(str[str.length -1]);
        s = s + rev.reverse();
    
        
        return s;
        
    }
}


//O(n) Better Solution
class Solution {
    private void swap(int j, int curr, char[] cc) {
		while(j <= curr) {
    		char temp = cc[j];
    		cc[j] = cc[curr];
    		cc[curr] = temp;
    		j++;
    		curr--;
    	}
	}
    public String reverseWords(String s) {
        int j=0;
        char[] cc = s.toCharArray();
        for(int i=0; i<cc.length; i++) {
            if(i == cc.length - 1) {
            	swap(j, i, cc);
            }
            if(cc[i] == ' ') {
            	swap(j, i-1, cc);
                j = i+1;
            }
        }
        return String.valueOf(cc);
        
    }
}