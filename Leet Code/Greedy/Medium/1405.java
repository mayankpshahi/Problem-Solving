//1405. Longest Happy String

class Solution {
    public String longestDiverseString(int a, int b, int c) {
       StringBuilder sb =  new StringBuilder();
        int total=  a+b+c;
        int countA = 0,countB=0,countC=0;
        
        for(int i=0;i<total;i++){
            if((a>=b && a>=c && countA!=2)||(a>0 && (countB==2||countC==2) )){
                
                    sb.append('a');
                    a--;
                    countB=0;
                    countC=0;
                    countA++;
                
            }
            else if((b>=a && b>=c && countB!=2)||(b>0 && (countA==2||countC==2)) ){
                
                    sb.append('b');
                    b--;
                    countA=0;
                    countC=0;
                    countB++;
                
            }
            else if((c>=b && c>=a && countC!=2)||(c>0 && (countB==2||countA==2)) ){
                
                    sb.append('c');
                    c--;
                    countB=0;
                    countA=0;
                    countC++;
                
            }
            
        }
        
        return sb.toString();
        
        
        
    }
}