//409. Longest Palindrome

//O(n)
class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        Set<Character> set = new HashSet<>();
        int count = 0;
        char[] arr = s.toCharArray();
        for(char c:arr) {
		if(set.remove(c)) {
			count++;
		} else {
			set.add(c);
		}
	}
	return set.isEmpty() ? count*2 : count*2+1;

    }
}

//O(n)
class Solution {
    public int longestPalindrome(String s) {
        int[] count=new int[128];
        for(char c:s.toCharArray()){
            count[c]++;
        }
        int ans=0;
        for(int v:count){
            ans+= v/2 * 2;
        }
        return ans<s.length() ? ans+1 : ans;

    }
}
