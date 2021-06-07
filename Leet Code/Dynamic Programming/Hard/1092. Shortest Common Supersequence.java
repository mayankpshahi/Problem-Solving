

//1092. Shortest Common Supersequence


class Solution {
    private int t[][]= new int[1001][1001]; 
    private String scs(int p, int q, String s1, String s2){
       for(int i=0;i<t.length;i++)
         t[i][0] = 0;
       for(int j=0;j<t[0].length;j++)
         t[0][j] = 0;
         
   for(int i=1;i<p+1;i++){
       for(int j=1;j<q+1;j++){
            if(s1.charAt(i-1) == s2.charAt(j-1)) t[i][j] = 1+t[i-1][j-1];
            else t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
       } 
    }
    StringBuilder sb = new StringBuilder();
    int i=p, j=q;
    while(i>0 && j>0){
        if(s1.charAt(i-1) == s2.charAt(j-1)){
         sb.append(s1.charAt(i-1));
        i--;j--;
        }
        else if (t[i-1][j] >t[i][j-1]){
             sb.append(s1.charAt(i-1));
             i--; 
        }
        else{
            sb.append(s2.charAt(j-1));
            j--;
        }
         
    }
    while(j>0){
        sb.append(s2.charAt(j-1));
        j--;
        
    }
    while(i>0){
         sb.append(s1.charAt(i-1));
             i--; 
    }
        
 return sb.reverse().toString();
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        return scs(str1.length(),str2.length(),str1,str2);
    }
}