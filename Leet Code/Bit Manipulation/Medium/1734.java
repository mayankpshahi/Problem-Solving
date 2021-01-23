

//1734. Decode XORed Permutation

class Solution {
    
    static int xor_all_elem(int n) 
{ 
  
    switch (n & 3) { 
  
    case 0: 
        return n; 
    case 1: 
        return 1; 
    case 2: 
        return n + 1;  
    } 
    return 0; 
} 
    
    
    static int[] calArray(int xarr[], int n) 
{ 
    
    List<Integer> l = new ArrayList<Integer>(); 
  
    
    int xor_full = xor_all_elem(n); 
    int xor_neigh = 0; 
  
    
    for (int i = 0; i < n - 1; i += 2) { 
        xor_neigh = xor_neigh ^ xarr[i]; 
    } 
    int last_elem = xor_full ^ xor_neigh; 
    l.add(last_elem); 
  
    
    for (int i = n - 2; i >= 0; i--) 
    { 
    
        last_elem = xarr[i] ^ last_elem; 
        l.add(last_elem); 
    } 
    
    Collections.reverse(l);
    int[] array = l.stream().mapToInt(i->i).toArray();
  
    return array; 
} 
    public int[] decode(int[] encoded) {
        int decode[] =  calArray(encoded,encoded.length+1);
        
        return decode;
    }
}



//Another Approach

 public int[] decode(int[] A) {
        int n = A.length + 1, a = 0, res[] = new int[n];
        for (int i = 0; i <= n; ++i) {
            a ^= i;
            if (i < n && i % 2 == 1) {
                a ^= A[i];
            }
        }
        res[0] = a;
        for (int i = 0; i < n - 1; ++i) {
            res[i + 1] = res[i] ^ A[i];
        }
        return res;
    }