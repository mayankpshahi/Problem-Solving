//791. Custom Sort String
//O(n)

class Solution {
    public String customSortString(String S, String T) {
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[26];

        for(char c:T.toCharArray())
        {
            arr[c-'a']++;
        }

        for(int i=0;i<S.length();i++)
        {
            int x=S.charAt(i)-'a';
            while(arr[x]>0)
            {
                sb.append((char)(x+97));
                arr[x]--;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]>0)
            {
                sb.append((char)(i+97));
                arr[i]--;
            }
        }

    return sb.toString();
    }
}
