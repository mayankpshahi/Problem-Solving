



//459. Repeated Substring Pattern


class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
	for(int i=l/2;i>=1;i--) {
		if(l%i==0) {
			int m = l/i;
			String subS = str.substring(0,i);
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<m;j++) {
				sb.append(subS);
			}
			if(sb.toString().equals(str)) return true;
		}
	}
	return false;
    }
}




//KMP algorithm Solution



class Solution {
    public boolean repeatedSubstringPattern(String s) {
     int n =  s.length();
        
    int lps [] =  new int[n];
        
    for(int i=1;i<n;i++){
        int j= lps[i-1];
        while(j>0 && s.charAt(i)!=s.charAt(j)) j=lps[j-1];
        
        if(s.charAt(i)==s.charAt(j)) j++;
        lps[i]=j;
    }
        
        
    int l= lps[n-1];
    
    return (l!=0) && (n%(n-l)==0);
    }
}