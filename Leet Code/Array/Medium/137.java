//137. Single Number II


//O(32n) 7ms

class Solution {
    public int singleNumber(int[] nums) {
       int num = 0;
       int bits[] = new int[32];
       //bits= {0};
       for(int i=0;i<32;++i){
           for(int n:nums){
               bits[i]+= n >> i & 1;
               bits[i] %=3;
           }
       }
       for(int i=0;i<32;++i){
           num |= (bits[i] << i);

       }
    return num;
    }
}

//O(n)

class Solution {
    public int singleNumber(int[] nums) {
       int once = 0;
       int twos =0 ;
       int thrice = 0;
       for(int n:nums){
           twos |=(once & n);
           once ^=n;
           thrice = once & twos;
           once &= ~thrice;
           twos &= ~thrice;

       }
       return once;
    }
}
