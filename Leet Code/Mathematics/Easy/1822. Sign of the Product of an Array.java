

//1822. Sign of the Product of an Array


class Solution {
    public int arraySign(int[] nums) {
        long prod =1;
        for(int  i:nums) {
           
            if(i>0 && prod == 1)prod= 1;
            else if(i>0 && prod == -1)prod= -1;
        else if(i== 0) prod=0;
        else if(i<0 && prod == 1)prod= -1;
         else if(i<0 && prod == -1)prod= 1;
            
        }
   
        
        if(prod>0)return 1;
        else if(prod == 0) return 0;
        else return -1;
        
    }
}