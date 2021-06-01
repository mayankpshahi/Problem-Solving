


//Ways to Decode



// Memoization



public class Solution {
    int t [];
   public int numDecodings(String s) {
      t = new int[s.length()+1];
       Arrays.fill(t,-1);
       return s.length()==0?0:numDecodings(0,s);
   }
   private int numDecodings(int p, String s) {
       
       int n=s.length();
       if(p==n) return 1;
       if(s.charAt(p)=='0') return 0;
       if(t[p]!=-1) return t[p];
       int res=numDecodings(p+1,s);
       if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7')) 
           res+=numDecodings(p+2,s);
       return t[p]=res;
   }
}



// Bottom up


public class Solution {
    int t [];
   public int numDecodings(String s) {
       int n=s.length();
       t=new int[n+1];
       t[n]=1;
       for(int i=n-1;i>=0;i--)
           if(s.charAt(i)!='0') {
               t[i]=t[i+1];
               if(i<n-1&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7')) 
                   t[i]+=t[i+2];
           }
       return t[0];   
   }
  
}


//Costant space
public class Solution {
    int mod = 1000000007;
   public int numDecodings(String s) {
       int t1=1, t2=0, n=s.length();
       for(int i=n-1;i>=0;i--) {
           int t=s.charAt(i)=='0'?0:t1;
           if(i<n-1&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7')){
                t+=t2;
                t%=mod;
           }
              
           t2=t1;
           t1=t;
       }
       return t1%mod;
   }
  
}
