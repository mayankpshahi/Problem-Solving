//28. Implement strStr()

//O(n)
class Solution {
    public int strStr(String haystack, String needle) {
        int h= haystack.length(), n = needle.length();
        if (h < n) {
            return -1;
        } else if (n == 0) {
            return 0;
        }
        int th = h - n;
        for (int i = 0; i <= th; ++i) {
            if (haystack.substring(i,i+n).equals(needle)) {
                return i;
            }
        }
        return -1;
 }
}



//Another Solution but not best
class Solution {
    public int strStr(String haystack, String needle) {
    for (int i = 0; ; i++) {
    for (int j = 0; ; j++) {
      if (j == needle.length()) return i;
      if (i + j == haystack.length()) return -1;
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
 }
}