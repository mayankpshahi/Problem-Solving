//96. Unique Binary Search Trees


//Mathematical Solution

class Solution {
    static double fact( double n ) { 
        if ( n <= 0 ) 
            return 1; 
        return n * fact( n - 1 );
    }
    public int numTrees(int n) {
        
        return ( int )Math.round( fact( 2 * n ) / ( fact( 1 + n ) * fact( n ) ) );
        
    }
}