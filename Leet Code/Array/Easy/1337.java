//1337. The K Weakest Rows in a Matrix

//O(m*n)
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       int m = mat.length;
        int n = mat[0].length;
        List<Integer>[]counter = new List[n+1];
        for(int i=0;i<m;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
                else{
                    break;
                }
            }
            if(counter[count]==null){counter[count] = new ArrayList<Integer>();}
            counter[count].add(i);
        }
        int[]res = new int[k];
        int j = 0;
        for(int i=0;j<k;i++){
            if(counter[i]==null){continue;}
            for(int ele:counter[i]){
                res[j++] = ele;
                if(j==k){break;}
            }
        }
        return res;


    }
}


//Binary Search Solution

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       int[] res = new int[mat.length];
        int i = 0;

        for(int[] arr : mat) {
            int index = binarySearch(arr);
            res[i] = index;
            i++;

        }
        int maxi = 0;
        int[] result = new int[k];

        for(int j = 0;j<k;j++){
            int max = mat[0].length+1;
            for(int o = 0;o<res.length;o++){
                if(max>res[o]){
                    max = res[o];
                    maxi = o;
                }
            }
            result[j] = maxi;
            res[maxi] = mat[0].length+1;
        }
        return result;
    }

    public int binarySearch(int[] arr){
        int b = 0;
        int e = arr.length-1;
        while(b<=e){
            int m = b+(e-b)/2;
            if(arr[m]==1)
                b=m+1;
            else
                e = m-1;
        }
        return b;


    }
}
