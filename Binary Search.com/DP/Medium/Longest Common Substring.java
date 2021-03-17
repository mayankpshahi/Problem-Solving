
//Longest Common Substring

import java.util.*;

class Solution {
     int t[][]= new int[1001][1001];
    public int solve(String s0, String s1) {
        int longest = 0;
        for(int i=0;i<t.length;i++)
         t[i][0] = 0;
        for(int j=0;j<t[0].length;j++)
         t[0][j] = 0;
    

    for(int i=1;i<s0.length()+1;i++){
       for(int j=1;j<s1.length()+1;j++){
            if(s0.charAt(i-1) == s1.charAt(j-1)){
                t[i][j] = 1+t[i-1][j-1];
                longest =  Math.max(longest,t[i][j]);
            }
            else t[i][j] = 0;
       } 
    } 

    return longest;


    }
}