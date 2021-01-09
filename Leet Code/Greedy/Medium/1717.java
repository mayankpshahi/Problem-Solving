//1717. Maximum Score From Removing Substrings

class Solution {
    public int maximumGain(String s, int x, int y) {
      Stack<Character> st= new Stack<>(), st1 = new Stack<>();
	int res = 0, max=Math.max(x,y), min =Math.min(x,y);
	char c1= (x>y)?'a':'b', c2=(x>y)?'b':'a';
        
	for(char c: s.toCharArray()) 
		if(!st.isEmpty() && st.peek() == c1 && c == c2) {
			st.pop(); 
			res +=max;
		} else st.push(c);
        
	while(!st.isEmpty()) {
		char c = st.pop();
		if(!st1.isEmpty() && st1.peek() == c1 && c == c2) {
			st1.pop(); 
			res +=min;
		} else st1.push(c);
	}
	return res;
        
    }
}