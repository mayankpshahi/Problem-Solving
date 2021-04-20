import java.util.*;

class Solution{


static int maxArithmeticSubarray(int array[]) {
  int maxLen = 0;
  for(int i = 0; i < array.length - 1;) {
     int j = i;
     int common_difference = array[i+1] - array[i];
     while(j < array.length - 1 && (array[j + 1] - array[j] == common_difference))
          j++;
     int max_j = j;
     maxLen = Math.max(maxLen, max_j - i + 1);
     i = Math.max(i + 1, j);
  }
  return maxLen;
}
   public static void main(String[] args){
       Scanner sc  =  new Scanner(System.in);
       int t = sc.nextInt();
       int len  = t;
       while(t-->0){
           int n = sc.nextInt();
           int arr[] =  new int[n];

           for(int i=0;i<n;i++)
             arr[i] = sc.nextInt();

           if(n==maxArithmeticSubarray(arr))
             System.out.println("Case #"+(len-t)+": "+n);
           else{
               int maxlen = 2;
              for(int i=0;i<arr.length -1;i++){
                int common_difference = arr[i+1] - arr[i];
                int j=i;
                while(j < arr.length - 2 && (arr[j + 1] - arr[j] == common_difference))
                       j++;
            //System.out.println(j+" "+arr[j]);
            int replace = arr[j+1];
            arr[j+1] = arr[j] + common_difference;
            maxlen = Math.max(maxlen, maxArithmeticSubarray(arr));
            arr[j+1] = replace;
            //System.out.println("After"+" "+j+" "+arr[j]+" "+maxlen);


              }

              System.out.println("Case #"+(len-t)+": "+maxlen);

           }
           
           
           

        
        


       }

   }
}