

import java.util.*;

class Solution{
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           int n = sc.nextInt();
           int k = sc.nextInt();
           String s = sc.next();

         //char [] arr = s.toCharArray();
        

         int count = 0;
         int end = s.length();
         for(int i=0;i<(end/2);i++){
             if(s.charAt(i)!=s.charAt(end-i-1))
                 count++;
            }
         count =  Math.abs(count - k);
        System.out.println("Case #"+(len-t)+": "+count);



       }

   }
}