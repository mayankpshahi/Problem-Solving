

//1909. Remove One Element to Make the Array Strictly Increasing

class Solution {
    public boolean canBeIncreasing(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i] - sequence[i+1] >= 0) {
                        numErr += 1;
if (i - 1 >= 0 && i + 2 <= sequence.length - 1 && sequence[i] - sequence[i+2] >= 0 && sequence[i-1] - sequence[i+1] >= 0) {
		              return false;
		        }
        }
     }
        return numErr <= 1;
    }
}