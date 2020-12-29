//1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K



class Solution {
    
    public int findMinFibonacciNumbers(int k) {
        if (k < 2) return k;
        int fib1 = 1, fib2 = 1;
        while (fib2 <= k) {
            fib2 += fib1;
            fib1 = fib2 - fib1;
        }
        return 1 + findMinFibonacciNumbers(k - fib1);
        
    }
}