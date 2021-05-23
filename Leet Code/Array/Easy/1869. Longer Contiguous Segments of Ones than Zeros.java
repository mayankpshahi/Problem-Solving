


//1869. Longer Contiguous Segments of Ones than Zeros

class Solution {
    public boolean checkZeroOnes(String s) {
        int long1 =0,long0 = 0,check1=0,check0=0;
        
        for(char c:s.toCharArray()){
            if(c=='1'){
                check1++;
                
                long0 = Math.max(long0,check0);
                long1 = Math.max(long1,check1);
                
                check0=0;
            }else if(c=='0'){
                check0++;
                
                long0 = Math.max(long0,check0);
                long1 = Math.max(long1,check1);
                check1=0;
            }
        }
         long0 = Math.max(long0,check0);
         long1 = Math.max(long1,check1);
        
        return long1>long0?true:false;
        
    }
}