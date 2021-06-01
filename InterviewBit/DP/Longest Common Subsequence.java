




//Memoization


public class Solution {
    int t [][];
    public int solve(String A, String B) {
        int p =  A.length();
        int q =  B.length();
        t = new int[p+1][q+1];
        for(int arr[]:t)
        Arrays.fill(arr,-1);
        
        return lcs(p,q,A,B);
        
        
        
    }
    private int lcs(int p,int q,String A, String B ){
        if(p==0 || q==0) return 0;
        
        if(t[p][q]!=-1) return t[p][q];
        
        if(A.charAt(p-1)==B.charAt(q-1))
          return t[p][q] = 1 + lcs(p-1,q-1,A,B);
        else
         return t[p][q] = Math.max(lcs(p-1,q,A,B),lcs(p,q-1,A,B));
        
        
    }
}



//Top Down


public class Solution {
    int t [][];
    public int solve(String A, String B) {
        int p =  A.length();
        int q =  B.length();
        t = new int[p+1][q+1];
       
        
        return lcs(p,q,A,B);
        
        
        
    }
    private int lcs(int p,int q,String A, String B ){
        if(p==0 || q==0) return 0;
        
        for(int i=1;i<p+1;i++){
       for(int j=1;j<q+1;j++){
            if(A.charAt(i-1) == B.charAt(j-1)) t[i][j] = 1+t[i-1][j-1];
            else t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
       } 
    } 
    
    return t[p][q];

        
        
    }
}
