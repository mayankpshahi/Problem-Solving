

//1910. Remove All Occurrences of a Substring


class Solution {
    public String removeOccurrences(String s, String part) {
         while (s.contains(part)) {
		s = s.replaceFirst(part , "");
	}
	return s;
        
    }
}