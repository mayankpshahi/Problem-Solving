





//885. Spiral Matrix III


class Solution {
    public int[][] spiralMatrixIII(int r, int c, int r0, int c0) {
        
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // east, south, west, north
        
        List<int[]> res = new ArrayList<>();
        
        int len = 0, d = 0; // move <len> steps in the <d> direction
        
        res.add(new int[]{r0, c0});
        
        while (res.size() < r* c) {
            if (d == 0 || d == 2) len++; // when move east or west, the length of path need plus 1 
            for (int i = 0; i < len; i++) {
                r0 += dir[d][0];
                c0 += dir[d][1];
                if (r0 >= 0 && r0 < r && c0 >= 0 && c0 < c) // check valid
                    res.add(new int[]{r0, c0});
            }
            d = (d + 1) % 4; // turn to next direction
        }
        return res.toArray(new int[r * c][2]);
        
    }
}