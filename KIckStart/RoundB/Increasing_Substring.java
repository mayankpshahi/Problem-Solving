

import java.util.*;

class Solution{
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           int n = sc.nextInt();
           String s = sc.next();
           
           int res[] =  new int[n];
           int count=1;
           res[0] =1;
           for(int i=1;i<n;i++){
                if(s.charAt(i)>s.charAt(i-1))
                  res[i] = res[i-1] + 1;
                else
                  res[i]=1;
                
               
           }
           

        System.out.print("Case #"+(len-t)+": ");
        for(int i=0;i<n;i++){
            if(i!=n-1)
             System.out.print(res[i]+" ");
            else
              System.out.print(res[i]);
                
               
           }

           System.out.println();



       }

   }
}