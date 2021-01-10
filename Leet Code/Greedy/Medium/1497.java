//1497. Check If Array Pairs Are Divisible by k

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq[] = new int[k];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k<0)freq[(arr[i]%k)+k]++;
            else freq[arr[i]%k]++;
            
        }
        int start = 1,end = k-1;
        while(start<end){
            if(freq[start]!=freq[end]) return false;
            
            start++;
            end--;
                
                
        }
        if(freq[0]%2==0) return true;
        else return false;
            
        
    }
}