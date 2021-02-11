
//733. Flood Fill

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)return image;
        
        int color = image[sr][sc];
        dfs(image,sr,sc,color,newColor);
        
        return image;
        
    }
     public void dfs(int[][] img, int sr, int sc, int color,int newColor) {
        if( sr<0 || sc<0 || sr>=img.length || sc>=img[0].length || img[sr][sc]!=color)
            return;
         
        img[sr][sc] = newColor;
         
        dfs(img,sr-1,sc,color,newColor);
        dfs(img,sr,sc-1,color,newColor);
        dfs(img,sr+1,sc,color,newColor);
        dfs(img,sr,sc+1,color,newColor);
        
    }
}