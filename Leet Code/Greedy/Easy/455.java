//455. Assign Cookies


class Solution {
    public int findContentChildren(int[] g, int[] s) {
       
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for(int j=0;count<g.length && j<s.length;j++) {
	       if(g[count]<=s[j]) count++;
         }
         return count;
    }
}