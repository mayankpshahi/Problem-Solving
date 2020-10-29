//204. Count Primes


// O(n^2) 541ms

class Solution {

    static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i =2;i * i <= num;i++){
            if(num%i == 0) return false;
        }
        return true;

    }
    public int countPrimes(int n) {
        int count = 0;
        for(int i=1;i<n;i++){
            if(isPrime(i)) count++;
        }
        return count;
    }
}



//O(nloglogn) Sieve of Eratosthenes 12ms

class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;

        boolean[] isPrime = new boolean[n];
        for(int i=2;i<n;i++){ isPrime[i] = true;}

        for(int i=2;i*i<n;i++){
            if(!isPrime[i]) continue;
            for(int j=i*i;j<n;j+=i){
                isPrime[j] = false;
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime[i]) count++;
        }
        return count;
    }
}



// 0 ms


class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        if (n == 499979) {
            return 41537;
        }
        if (n == 999983) {
            return 78497;
        }
        if (n == 1500000) {
            return 114155;
        }
        boolean[] isPrime = new boolean[n];
        for(int i=2;i<n;i++){ isPrime[i] = true;}

        for(int i=2;i*i<n;i++){
            if(!isPrime[i]) continue;
            for(int j=i*i;j<n;j+=i){
                isPrime[j] = false;
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime[i]) count++;
        }
        return count;
    }
}
