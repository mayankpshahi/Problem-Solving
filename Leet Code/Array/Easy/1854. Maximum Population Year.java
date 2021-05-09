

//1854. Maximum Population Year


class Solution {
    public int maximumPopulation(int[][] logs) {
        
       int year[] = new int[2051], max = 0;
        
    for (int l[] : logs) {
        ++year[l[0]];
        --year[l[1]];
    }
        
    for (int i = 1950; i < 2050; ++i) {
        year[i] += year[i - 1];
        max = year[i] > year[max] ? i : max;
    }
    return max;
        
    }
}