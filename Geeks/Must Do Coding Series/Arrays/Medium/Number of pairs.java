

//Number of pairs

class Solution
{
    
   static int getMinGreaterIndex(int y[],int n , int num){
        int low=0;
        int high =  n-1;
        int res = -1;
        while(low<=high){
            int mid =  (low+high)/2;
            if(y[mid]>num){
                res =  mid;
                 high = mid-1;
            }
             else low = mid+1;
        }
        return res;
    }
     // x[], y[]: input array elements
    // n, m: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int x[], int y[], int n, int m)
    {
        // your code here
        Arrays.sort(x);
        Arrays.sort(y);
        
        long count=0;
        int cnt0 =0,cnt1=0,cnt3=0,cnt4=0,cnt2=0;
        
       
            for(int j=0;j<m;j++){
             if(y[j]==0)cnt0++;
             if(y[j]==1)cnt1++;
             if(y[j]==2)cnt2++;
             if(y[j]==3)cnt3++;
             if(y[j]==4)cnt4++;
             
     }
     
     for(int i=0;i<n;i++){
         if(x[i]==0)continue;//0 can not be paired with anything
         else if(x[i]==1)count+=cnt0;//1 can be paired with 0 only.
         else if(x[i]==2){// It will get paired with no.s greater than 2
           int ind = getMinGreaterIndex(y,m ,2);
           if(ind!=-1)count += m - ind;
            count+=(-cnt3-cnt4 + cnt0 + cnt1);
              
              }
          else{
               int ind = getMinGreaterIndex(y,m ,x[i]);
               
              if(ind!=-1) count += m - ind;
              
              count+= cnt0 + cnt1;
              
              if(x[i]==3) count+=cnt2;
          }
         
     }
      
        
        return count;
    }
}