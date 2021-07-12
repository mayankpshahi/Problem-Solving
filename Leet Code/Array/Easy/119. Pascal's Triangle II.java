




//119. Pascal's Triangle II

class Solution {
    public List<Integer> getRow(int numRows) {
        
        List<List<Integer>> res  = new ArrayList<>();
        
         List<Integer> row ;
         List<Integer> last=null;
        
        
        for(int i=0;i<=numRows;i++){
            row =  new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(last.get(j)+last.get(j-1));
            }
            last =row;
            res.add(row);
        }
        
        
        return res.get(numRows);
        
    }
}