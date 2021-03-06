
//1780. Check if Number is a Sum of Powers of Three

class Solution {
    
    static int log3(int x)
{
    return (int) (Math.log(x) / Math.log(3));
}
    public boolean checkPowersOfThree(int n) {
        boolean flag = true;
         int base=-1;
        while(n>0){
           
            int xval=(int)log3(n);
            n=n-(int)Math.pow(3,log3(n));
            if(base==xval){
                flag=false; break;
            }
            base=xval;
        }
        
        if(n==0 && flag==true) return true;
        return false;
        
    }
}