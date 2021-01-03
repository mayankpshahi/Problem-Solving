//1710. Maximum Units on a Truck

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     
        
        Arrays.sort(boxTypes, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        int q =Integer.compare(a[1], b[1]);
        if(q==1 || q==-1){
            return Integer.compare(b[1], a[1]);
        }else {
             return Integer.compare(a[0], b[0]);
        }
    }
});
      int sum=0;
        for(int i=0;i<boxTypes.length;i++){
            if(boxTypes[i][0]<=truckSize){
                sum+=(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0];
                
                
            }
            else if (boxTypes[i][0]>truckSize){
                
                sum+=truckSize*boxTypes[i][1];
                truckSize=0;
                
            }
        }
        
        
        return sum;
    }
}