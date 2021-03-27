




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
    static boolean next_permutation(int[] p) {
        for (int a = p.length - 2; a >= 0; --a)
          if (p[a] < p[a + 1])
            for (int b = p.length - 1;; --b)
              if (p[b] > p[a]) {
                int t = p[a];
                p[a] = p[b];
                p[b] = t;
                for (++a, b = p.length - 1; a < b; ++a, --b) {
                  t = p[a];
                  p[a] = p[b];
                  p[b] = t;
                }
                return true;
              }
        return false;
      }
    static int calculateCost(int arr[],int n){
      int cost= 0;
       
      for(int i = 0; i < n-1; i++){
        int j = findMinIndex(arr, i, n-1);
        
        if(arr[i]>arr[j]){

            reverse(arr, i, j);

         }

         cost += (j-i)+1;
    }
    return cost;

    }
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           int n = sc.nextInt();
           int c = sc.nextInt();
           int arr[] =  new int[n];
           
           for(int i=0;i<n;i++) arr[i] = i+1;

           boolean flag = false;
           
           do{
             int newarr[] = Arrays.copyOf(arr, arr.length);
             int cost = calculateCost(newarr,newarr.length);

             if(cost == c){
              flag=true;
              System.out.print("Case #"+(len-t)+": ");
              for(int i=0;i<n;i++)System.out.print(arr[i] + " ");
              System.out.println();
               break;
             }
            }while(next_permutation(arr));
           
            if(!flag){
              System.out.println("Case #"+(len-t)+": IMPOSSIBLE");
            }
        
       
       }

   }
}