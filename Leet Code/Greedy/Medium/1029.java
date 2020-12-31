//1029. Two City Scheduling


class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum=0;
        int n = costs.length/2;
        
        Arrays.sort(costs, new Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
    return (a[0]-a[1] > b[0]-b[1]) ? 1 : -1;}});
            
        for(int i = 0;i<costs.length;i++){
           if(i<n)
               sum+=costs[i][0];
            else
                sum+=costs[i][1];
        }
        return sum;
        
    }
}