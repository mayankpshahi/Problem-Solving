
//Spirally traversing a matrix

class Solution{
    static ArrayList<Integer> spirallyTraverse(int a[][], int r, int c)
    {
        // code here 
        int  start_row = 0, start_col = 0,end_row = r,end_col =c;
        
        ArrayList<Integer> l =  new ArrayList<Integer>();
        
        int i=0;
        while (start_row < end_row && start_col < end_col) {
            
            for (i = start_col; i < end_col; i++) {
                l.add(a[start_row][i]);
            }
            start_row++;
 
            
            for (i = start_row; i < end_row; i++) {
                 l.add(a[i][end_col - 1]);
            }
            end_col--;
 
           
            if (start_row < end_row) {
                for (i = end_col - 1; i >= start_col; --i) {
                    l.add(a[end_row - 1][i]);
                }
                end_row--;
            }
 
           
            if ( start_col < end_col) {
                for (i = end_row - 1; i >= start_row; --i) {
                     l.add(a[i][start_col]);
                }
                start_col++;
            }
        }
        
        return l;
    }
}
