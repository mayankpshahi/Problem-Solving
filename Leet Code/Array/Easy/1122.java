//1122. Relative Sort Array

//O(1000 *m)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[]=new int[1001];
        int res[]=new int[arr1.length];

        for(int e:arr1){
            freq[e]++;
        }

        int j=0;
        for(int e:arr2){
            while(freq[e]>0){
                res[j++]=e;
                freq[e]--;
            }
        }

        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                res[j++]=i;
                freq[i]--;
            }

        }

        return res;


    }
}
