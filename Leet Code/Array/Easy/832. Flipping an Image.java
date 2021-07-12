




//832. Flipping an Image





class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n =  image.length;
        int [][] res =  new int[n][n];
        
        int p=0;
        int q =0;
        
        for(int img[]:image){
         q=0;
          for(int j=n-1;j>=0;j--){
              res[p][q] = img[j];
              q++;
          }
           p++; 
        }
        
        for(int img[]:res){
          for(int j=n-1;j>=0;j--){
              if(img[j]==0)img[j]=1;
              else img[j]=0;
          }
          
        }
        
       return res; 
        
    }
}