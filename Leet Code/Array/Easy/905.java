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
        int l = 0, r = A.length - 1;
        while (l < r) {
            if ((A[l] & 1) == 0) {
                l++;
            } else {

                while (l < r && ((A[r] & 1) == 1)) {
                    r--;
                }

                if (l < r) {
                    int tmp = A[r];
                    A[r] = A[l];
                    A[l] = tmp;
                    l++;
                    r--;
                }
            }
        }
        return A;
    }
}
