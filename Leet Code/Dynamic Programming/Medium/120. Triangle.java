


//120. Triangle


class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
     for(int i=1;i<triangle.size();i++){
            
            List<Integer> upperRow = triangle.get(i-1);
            List<Integer> row= triangle.get(i);
            
            for(int j=0;j<row.size();j++){
			
			
                if(j == 0){
                    row.set(j,row.get(j) + upperRow.get(j));
                    
                }
                else if(j == row.size()-1){
                    row.set(j,row.get(j) + upperRow.get(j-1));
                    
                }
               else{
                   row.set(j, row.get(j) + Math.min(upperRow.get(j-1),upperRow.get(j)));
               }
            }
        }

        int min=Integer.MAX_VALUE;
        for(int i:triangle.get(triangle.size()-1)){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}