
//476. Number Complement


class Solution {
    public int findComplement(int num) {
        int sum = 0;
        int j = 0;
        
        while (sum < num)
        {
            sum += Math.pow(2, j);
            j++;
        }
        
        return sum - num;
        
    }
}