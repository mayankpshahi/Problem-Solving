//1299. Replace Elements with Greatest Element on Right Side

//O(n) time and O(1) space

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
         for(int i=arr.length-1;i>=0;i--){
            int t = arr[i];
            arr[i] = max;
            max = Math.max(t,max);
        }
        return arr;

    }
}
