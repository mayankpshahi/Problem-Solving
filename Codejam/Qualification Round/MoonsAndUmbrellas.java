



import java.util.*;

class Solution{
    
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           
           int x = sc.nextInt();
           int y = sc.nextInt();
           String s = sc.next();
           
           char arr[] =  s.toCharArray();

           char swap = 'P';
           int cost = 0;
           for(int i = 0; i < arr.length-1; i++){
               if(arr[i] == 'J' && arr[i+1] == '?')swap = 'J';
               else if(arr[i] == 'C' && arr[i+1] == '?')swap = 'C';
               else if(arr[i] == '?' && arr[i+1] == 'C' && swap == 'J')cost += y;
               else if(arr[i] == '?' && arr[i+1] == 'J' && swap == 'C')cost += x;
               
               if(arr[i] == 'J' && arr[i+1] == 'C')cost+= y;
               else if(arr[i] == 'C' && arr[i+1] == 'J')cost += x;
            
            }

            System.out.println("Case #"+(len-t)+": "+cost);



       }

   }
}