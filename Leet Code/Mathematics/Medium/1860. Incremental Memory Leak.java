
//1860. Incremental Memory Leak

class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int out [] =  new int[3];
        int t =1;
        
        
        
        while((memory1>=t||memory2>=t)){
            
            if(memory1>=memory2){
                memory1-=t;;
            }else{
                memory2-=t;
            }
            t++;
            
        }
        
        out[0] = t;
        out[1] = memory1;
        out[2] = memory2;
        
        return out;
        
    }
}