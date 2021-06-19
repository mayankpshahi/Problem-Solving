


//Trailing Zeroes


public class Solution {
    public int solve(int a) {
        int trail_z = 0;
        for(int i=0;i<32;i++){
            int val =a&(1<<i);
            if(val==0)
            trail_z++;
            else
            break;
            
        }
return trail_z;
    }
}
