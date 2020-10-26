//1232. Check If It Is a Straight Line

//O(n)

class Solution {
    static boolean collinear(int x1, int y1, int x2,int y2, int x3, int y3)
    {
        int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

        if (a == 0)
            return true;
        else
            return false;
    }


    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2)
            return true;

        boolean flag = true;
        if(coordinates.length == 3){
            flag = collinear(coordinates[0][0],coordinates[0][1],coordinates[1][0],coordinates[1][1],coordinates[2][0],coordinates[2][1]);
        }
        else{

        for(int i = 0;i<coordinates.length - 2;i++){
            if(flag == true){
                flag = collinear(coordinates[i][0],coordinates[i][1],coordinates[i+1][0],coordinates[i+1][1],coordinates[i+2][0],coordinates[i+2][1]);
            }
            else
                break;


        }}

        return flag;


    }
}
