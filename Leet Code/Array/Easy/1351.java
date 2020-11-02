//1351. Count Negative Numbers in a Sorted Matrix

//O(n^2)

class Solution {
    public int countNegatives(int[][] grid) {
        int count= 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = grid[0].length -1;j>=0;j--){
                if(grid[i][j]<0)count++;
                else break;

            }}
        return count;

    }
}

//O(nlogn)

class Solution {
    public int countNegatives(int[][] grid) {
       int res = 0;
        for(int i = 0; i < grid.length; ++i) {
            res += negativeInRow(grid[i]);
        }
        return res;
    }

    private int negativeInRow(int[] row) {
        int res = 0;
        int l = 0, r = row.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (row[mid] >= 0) {
                l = mid + 1;
            } else if (row[mid] < 0) {
                res += r - mid + 1;
                r = mid - 1;
            }
        }
        return res;

    }
}
