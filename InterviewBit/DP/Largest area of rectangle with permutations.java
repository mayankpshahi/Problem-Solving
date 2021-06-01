

//Largest area of rectangle with permutations


public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n =  A.size();
        int m  =  A.get(0).size();
        
        //add column height
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i!=0 && A.get(i).get(j)!=0){
                    A.get(i).set(j,A.get(i).get(j)+A.get(i-1).get(j));
                }
            }
        }
        
        
        //sort rows
         for(int i=0;i<n;i++){
             Collections.sort(A.get(i));
         }
         
         //Area calculation
         int maxArea = 0, area =0;
          for(int i=0;i<n;i++){
              int width = 1;
            for(int j=m-1;j>=0;j--){
                area = A.get(i).get(j)*width;
                width++;
                maxArea = Math.max(maxArea,area);
                
            }
        }
        
        return maxArea;
        
    }
}
