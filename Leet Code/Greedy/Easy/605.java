//605. Can Place Flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
       for(int i=0;i<flowerbed.length;i++){
           int prev = i == 0 ? i : i - 1;
           int next = i == flowerbed.length - 1 ? i : i + 1;
           if(flowerbed[prev]==0 && flowerbed[i]==0 && flowerbed[next]==0){ 
               flowerbed[i] = 1;
               n--;
               
           }
           if(n==0)
            return true;
       }
        
            return false;
        
    }
}