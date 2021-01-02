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