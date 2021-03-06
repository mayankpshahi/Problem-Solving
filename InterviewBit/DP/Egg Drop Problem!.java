


//Egg Drop Problem!

public class Solution {
    int t[][] = new int[101][10001];

    public int solve(int A, int B) {
        for(int a[]:t)
        Arrays.fill(a,-1);
         
         return solveEgg(A,B);
        
    }
     private int solveEgg(int e, int f){
        if(f==0 || f==1)
            return f;
        if(e==1)
          return f;
        
        if(t[e][f]!=-1)
            return t[e][f];

        
        int min =  Integer.MAX_VALUE;
        
        int left =1,right = f;
        while(left<=right){
            int mid = (left+right)/2;
            
        int left_sol = t[e-1][mid-1]!=-1?t[e-1][mid-1]:solveEgg(e-1,mid-1);
        t[e-1][mid-1]=left_sol;
        int right_sol = t[e][f-mid]!=-1?t[e][f-mid]:solveEgg(e,f-mid);
        t[e][f-mid]=right_sol;
       int temp= 1+ Math.max(left_sol,right_sol);
       
       if(left_sol<right_sol)
           left=mid+1;
        else
         right=mid-1;
        
         min = Math.min(min,temp);
    }
 return t[e][f]=min;

}

}
