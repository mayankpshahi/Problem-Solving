




//1041. Robot Bounded In Circle


class Solution {
    public boolean isRobotBounded(String instructions) {
        char arr[] =  instructions.toCharArray();
        int x=0,y=0;
        char curr = 'N';
        for(int i=0;i<4;i++){
          for(char k:arr){
              
              if(k=='G')
                {
                    if(curr=='N') y++;
                    else if(curr=='S') y--;
                    else if(curr=='E') x++;
                    else x--;
                }
                else if(k=='L')
                {
                    if(curr=='N') curr='W';
                    else if(curr=='S')  curr='E';
                    else if(curr=='E') curr='N';
                    else curr='S';
                }
                else if(k=='R')
                {
                    if(curr=='N') curr='E';
                    else if(curr=='S')  curr='W';
                    else if(curr=='E') curr='S';
                    else curr='N';
                }
              
              
          }
            
        if(x==0 && y==0) return true;
            
            
        }
        
        return false;
    }
}