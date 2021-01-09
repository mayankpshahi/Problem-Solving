//991. Broken Calculator

class Solution {
    public int brokenCalc(int X, int Y) {
        
        if(X==Y)return 0;
        
        if(X>Y)
            return X-Y;
        
        int count=0;
        while(Y>X){
            if(Y%2==0){
                Y = Y/2;
                count++;
                
            }else {
                Y=Y+1;
                count++;
            }
                
            
        }
        
        return count+X-Y;
            
            
        
        
        
    }
}