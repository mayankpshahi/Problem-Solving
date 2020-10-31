//905. Sort Array By Parity


//O(n) time and O(2n) space
class Solution {
    public int[] sortArrayByParity(int[] A) {
       List<Integer> evenlist = new LinkedList<Integer>();
       List<Integer> oddlist = new LinkedList<Integer>();
       int res[] = new  int[A.length];
        for(int i = 0 ;i<A.length;i++){
            if(A[i]%2 == 0)
                evenlist.add(A[i]);
            else
                oddlist.add(A[i]);
        }

        int p = 0;
        for(int i=0;i<evenlist.size();i++) {
            res[p++] = evenlist.get(i);
        }

        for(int i=0;i<oddlist.size();i++) {
            res[p++] = oddlist.get(i);
        }

        return res;

    }
}


//O(n) time O(n) space
class Solution {
    public int[] sortArrayByParity(int[] A) {
       int res[] = new  int[A.length];
        int p = 0;
        for(int i = 0 ;i<A.length;i++){
            if(A[i]%2 == 0){
                res[p++] = A[i];
            }
        }
         for(int i = 0 ;i<A.length;i++){
            if(A[i]%2!= 0){
                res[p++] = A[i];
            }
        }

        return res;

    }
}

//O(n)  and O(1) space

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }
}
