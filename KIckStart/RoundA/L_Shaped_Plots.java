




import java.util.*;

class Solution{



   static int helper(int a,int b){ 
        if(a<2)
          return 0;
        if (b<4)
           return 0;
        int start =2,end =a,res =2;
        while(start<=end){
            int mid = (start + end)/2;
            if(2*mid<=b){ 
            res =  Math.max(res,mid);
            start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return res -1;
        
      
   }
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           int r = sc.nextInt();
           int c = sc.nextInt();
           int arr[][] =  new int[r][c];

           for(int i=0; i<r; i++){
               for(int j=0; j<c; j++){
                   arr[i][j] = sc.nextInt();
               }
           }

           int left[][] =  new int[r][c];
           int right[][] =  new int[r][c];
           int up[][] =  new int[r][c];
           int down[][] =  new int[r][c];

           for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int  x = arr[i][j];
                int  p = j>0?left[i][j-1]:0;
                int  q = i>0?up[i-1][j]:0;
                left[i][j] = x==1?p+1:0;
                up[i][j] = x==1?q+1:0;
            }
        }

        for(int i=r-1; i>=0; i--){
            for(int j=c-1; j>=0; j--){
                int  x = arr[i][j];
                int  p = j<c-1?right[i][j+1]:0;
                int  q = i<r-1?down[i+1][j]:0;
                right[i][j] = (x==1?p+1:0);
                down[i][j] = (x==1?q+1:0);
            }
        }
        long count = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int a = up[i][j];
                int b = down[i][j];
                int e = left[i][j];
                int d = right[i][j];

                count+= helper(a,e) + helper(a,d) + helper(e,a) + helper(d,a);
                count+= helper(b,e) + helper(b,d) + helper(e,b) + helper(d,b);

            }
        } 

        System.out.println("Case #"+(len-t)+": "+count);



       }

   }
}