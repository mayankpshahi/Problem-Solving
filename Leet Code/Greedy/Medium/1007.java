//1007. Minimum Domino Rotations For Equal Row

class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        if(A.length!=B.length) return -1;
        boolean f =true;
        int freqA[]  = new int[8];
        for(int i: A)freqA[i]++;
        int freqB[]  = new int[8];
        for(int i: B)freqB[i]++;
        
        for(int i =0;i<7;i++){
            if(freqA[i]!=freqB[i])
                f=false;
        }
        if(!f){
        int countA=0;
        
        int max = 0;
        for(int i=0;i<7;i++){
            if(freqA[i]>freqA[max])max=i;
        }
        for(int i=0;i<A.length;i++){
            if(A[i]!=max){
                if(B[i]==max){
                    countA+=1;
                }else{
                    countA=0;
                    break;
                }
            }
        }
        int countB=0;
        max = 0;
        for(int i=0;i<7;i++){
            if(freqB[i]>freqB[max])
                max=i;
}
        for(int i=0;i<B.length;i++){
            if(B[i]!=max){
                if(A[i]==max){
                    countB+=1;
                }else{
                    countB=0;
                    break;
                }
            }
        }
        if((countA>0 && countB==0) || (countA<countB && countA!=0)) return countA;
        else  if((countB>0 && countA==0) || (countB<countA && countB!=0)) return countB;
        else return -1;
        }
        else return 0;
        
        
    }
}

//Best Solution

class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int minops = Integer.MAX_VALUE;
        for(int i = 1; i <=6; i++){
            minops = Math.min(minops, getops(A, B, i));
            minops = Math.min(minops, getops(B, A, i));
        }
        return ((minops != Integer.MAX_VALUE) ? minops : -1);
    }
    
    public int getops(int[] A, int[] B, int value){
        
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == value)
                continue;
            else if(B[i] == value)
                count++;
            else
                return Integer.MAX_VALUE;
        }
        return count;
    }
}


//Other Solutions
//1.
/*Count the occurrence of all numbers in A and B,
and also the number of domino with two same numbers.

Try all possibilities from 1 to 6.
If we can make number i in a whole row,
it should satisfy that countA[i] + countB[i] - same[i] = n

Take example of
A = [2,1,2,4,2,2]
B = [5,2,6,2,3,2]

countA[2] = 4, as A[0] = A[2] = A[4] = A[5] = 2
countB[2] = 3, as B[1] = B[3] = B[5] = 2
same[2] = 1, as A[5] = B[5] = 2

We have countA[2] + countB[2] - same[2] = 6,
so we can make 2 in a whole row.

Time O(N), Space O(1)*/



    public int minDominoRotations(int[] A, int[] B) {
        int[] countA = new int[7], countB = new int[7], same = new int[7];
        int n = A.length;
        for (int i = 0; i < n; ++i) {
            countA[A[i]]++;
            countB[B[i]]++;
            if (A[i] == B[i])
                same[A[i]]++;
        }
        for (int i  = 1; i < 7; ++i)
            if (countA[i] + countB[i] - same[i] == n)
                return n - Math.max(countA[i], countB[i]);
        return -1;
    }

//2.

/*Solution 2
Try make A[0] in a whole row,
the condition is that A[i] == A[0] || B[i] == A[0]
a and b are the number of swap to make a whole row A[0]

Try B[0]
the condition is that A[i] == B[0] || B[i] == B[0]
a and b are the number of swap to make a whole row B[0]

Return -1

*/

    public int minDominoRotations(int[] A, int[] B) {
        int n = A.length;
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == A[0] || B[i] == A[0]); ++i) {
            if (A[i] != A[0]) a++;
            if (B[i] != A[0]) b++;
            if (i == n - 1) return Math.min(a, b);
        }
        for (int i = 0, a = 0, b = 0; i < n && (A[i] == B[0] || B[i] == B[0]); ++i) {
            if (A[i] != B[0]) a++;
            if (B[i] != B[0]) b++;
            if (i == n - 1) return Math.min(a, b);
        }
        return -1;
    }


//3.

/*Solution 3
Find intersection set s of all {A[i], B[i]}
s.size = 0, no possible result.
s.size = 1, one and only one result.
s.size = 2, it means all dominoes are [a,b] or [b,a], try either one.
s.size > 2, impossible.

*/

    public int minDominoRotations(int[] A, int[] B) {
        HashSet<Integer> s = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int[] countA = new int[7], countB = new int[7];
        for (int i = 0; i < A.length; ++i) {
            s.retainAll(new HashSet<>(Arrays.asList(A[i], B[i])));
            countA[A[i]]++;
            countB[B[i]]++;
        }
        for (int i : s)
            return A.length - Math.max(countA[i], countB[i]);
        return -1;
    }