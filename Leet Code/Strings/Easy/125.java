//125. Valid Palindrome

//O(n/2)
class Solution {
    
    public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    int start=0;
	int end=str.length()-1;
	while(start<end)
	{
		if(str.charAt(start++)!=str.charAt(end--))
				return false;
	}
        return true;
    }
}

//Best Solution
class Solution {
    private static final char[]charMap = new char[256];
   static{
    for(int i=0;i<10;i++){
        charMap[i+'0'] = (char)(1+i);  // numeric
    }
    for(int i=0;i<26;i++){
        charMap[i+'a'] = charMap[i+'A'] = (char)(11+i);  //alphabetic, ignore cases
    }
}
    
    public boolean isPalindrome(String s) {
      char[]pChars = s.toCharArray();
    int start = 0,end=pChars.length-1;
    char cS,cE;
    while(start<end){
        cS = charMap[pChars[start]];
        cE = charMap[pChars[end]];
        if(cS!=0 && cE!=0){
            if(cS!=cE)return false;
            start++;
            end--;
        }else{
            if(cS==0)start++;
            if(cE==0)end--;
        }
    }
    return true;
    }
}