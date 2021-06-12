


//1893. Check if All the Integers in a Range Are Covered

class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        for(int i=left;i<=right;i++){
            boolean flag = false;
            for(int j=0;j<ranges.length;j++){
                if(i>=ranges[j][0] && i<=ranges[j][1]){
                    flag = true;
                    break;
                }
            }
            
            if(!flag) return false;
        }
        return true;
        
    }
}