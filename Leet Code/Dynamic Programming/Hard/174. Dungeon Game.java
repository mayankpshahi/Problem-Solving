




//174. Dungeon Game


class Solution {
    int[][] t;
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0 || dungeon[0].length == 0)
            return 0;
        
        t = new int[dungeon.length][dungeon[0].length];
        int min = solve(dungeon,0, 0);
        return min;
        
    }
    private int solve(int[][] dungeon,int x, int y){
        if(t[x][y] != 0)return t[x][y];
        
        if(x == dungeon.length - 1 && y == dungeon[0].length - 1){//The down-right corner
            t[x][y] = dungeon[x][y] < 0 ? -dungeon[x][y] + 1 : 1; //The minimum is 1
            return t[x][y];
        }
        int min = Integer.MAX_VALUE;
        //go down
        if(x < dungeon.length - 1){
            int down = solve(dungeon, x + 1, y);
            min = min < down ? min : down; 
        }
        //go right
        if(y < dungeon[0].length - 1){
            int right = solve(dungeon,x, y + 1);
            min = min < right ? min : right;
        }
        if(dungeon[x][y] >= min){//If min is 6, dungeon[x][y] if 10, then min should be updated to 1
            min = 1;
        }else{//If min is 6, dungeon[x][y] is 3 or -3, then min should be updated to 3 or 9
            min = min - dungeon[x][y];
        }
        t[x][y] = min;
        return min;
    }
}