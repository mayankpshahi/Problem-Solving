//1252. Cells with Odd Values in a Matrix

//O(nm) time and O(nm) space
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int a[][] = new int[n][m];
        for(int i =0;i<indices.length;i++){
            int p = indices[i][0];
            int q = indices[i][1];
            for(int j = 0;j<m;j++)
                a[p][j]++;

            for(int j = 0;j<n;j++)
                a[j][q]++;
        }
       int count = 0;
    for(int i = 0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i][j]%2!=0)count++;

        }
    }

        return count;

    }
}


//O(nm) time and O(nm) space but using boolean logic

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        for (int[] ind : indices) {
            rows[ind[0]] = !rows[ind[0]];
            cols[ind[1]] = !cols[ind[1]];
        }
        int res = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (rows[r]^cols[c])
                    res++;
            }
        }
        return res;
    }
}



//HashMap Solution
/* Logic used
Firs, I count rows and columns that appear odd number of times. Then I multiply row number to m, and columns number to n, because this is how much odd values they can have. But on the crossing of each row and table we will have even numbers. So we should subtract row * column from all odd values in rows, and then the same amount from all odd values in columns = (2 * row * column).

Example: 4*4, [[0,0],[1,1]]

result matrix:
2 2 1 1
2 2 1 1
1 1 0 0
1 1 0 0

we have 2 rows and 2 columns, that appear only one times, so all of them should have odd values. But on the crossing of these rows and tables we have event numbers, that we should subtract.
*/
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
          Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> columns = new HashMap<>();

        int row = 0;
        int column = 0;

        for(int i = 0; i < indices.length; i++){
            if (rows.containsKey(indices[i][0])){
                rows.remove(indices[i][0]);
            } else{
                rows.put(indices[i][0], 1);
            }

            if (columns.containsKey(indices[i][1])){
                columns.remove(indices[i][1]);
            } else {
                columns.put(indices[i][1], 1);
            }
            }

        row = rows.size();
        column = columns.size();
        return (row*m + column*n) - (2 * row * column);
    }
}
