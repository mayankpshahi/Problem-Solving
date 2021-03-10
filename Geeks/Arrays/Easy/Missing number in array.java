
//Missing number in array 

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int a = 1;
        for(int i=2;i<=n;i++) a^=i;
        
        for(int i=0;i<array.length;i++) a^=array[i];
        
        return a;
        
        
    }
}