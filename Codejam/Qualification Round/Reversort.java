



import java.util.*;

class Solution{
    

    static void reverse(int arr[],int start,int end){
       Stack<Integer> st =  new Stack<Integer>();

       for(int i=start; i<=end;i++) st.push(arr[i]);
       
       for(int i=start; i<=end;i++) arr[i]=st.pop();

    }
    static int findMinIndex(int arr[],int start,int end){
        int minind = start;

           for(int i=start;i<=end;i++){
               if(arr[i]<arr[minind]) minind = i;
           }

           return minind;

    }
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           int n = sc.nextInt();
           int arr[] =  new int[n];
           
           for(int i=0;i<n;i++) arr[i] = sc.nextInt();
           
           int cost = 0;
           int i=0,j=findMinIndex(arr,0,n-1);
           while(i<n-1 && j<n ){
            
               


              
         if(arr[i]>arr[j]){
        
            reverse(arr, i, j);

         }
               

              

               cost += (j-i)+1;
             
                   i++;
                   j= findMinIndex(arr,i,n-1);
            
              



           }

          
            
         
            
        System.out.println("Case #"+(len-t)+": "+cost);



       }

   }
}