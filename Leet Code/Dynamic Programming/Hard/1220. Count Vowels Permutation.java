



//1220. Count Vowels Permutation




class Solution {
     long mod = 1000000007;
    Map<String, Long> map;
    public int countVowelPermutation(int n) {
        map = new HashMap();
        char[] vowels = {'a','e','i','o','u'};
        int res = 0;
        for(int i=0; i<5; i++){
            res += (int) count(n, vowels, vowels[i]);
            res %= mod;
        }
        return res;
        
    }
    long count(int n, char[] v, char curr){
         if(n == 1) return 1;
        String index = curr+"_"+n;
        if(map.containsKey(index)) return map.get(index);

          
        // Each vowel 'a' may only be followed by an 'e'.
        // Each vowel 'e' may only be followed by an 'a' or an 'i'.
        // Each vowel 'i' may not be followed by another 'i'.
        // Each vowel 'o' may only be followed by an 'i' or a 'u'.
        // Each vowel 'u' may only be followed by an 'a'.
        // === In other words: 
        // 'a' can be followed by {'e'}
        // 'e' can be followed by {'a', 'i'}
        // 'i' can be followed by {'a', 'e', 'o', 'u'}
        // 'o' can be followed by {'i', 'u'}
        // 'u' can be followed by {'a'}
        // === In other words:
        // 'a' can follow {'e', 'i', 'u'}
        // 'e' can follow {'a', 'i'}
        // 'i' can follow {'e', 'o'}
        // 'o' can follow {'i'}
        // 'u' can follow {'i', 'o'}
        long ans = 0;
        if(curr =='a'){
            ans += (count(n-1, v, 'e') + count(n-1, v, 'i') + count(n-1, v, 'u'));
        } else if(curr =='e') {
            ans += (count(n-1, v, 'a') + count(n-1, v, 'i'));
        } else if(curr =='i') {
            ans += (count(n-1, v, 'e') + count(n-1, v, 'o'));
        } else if(curr =='o') {
            ans += count(n-1, v, 'i');
        } else if(curr =='u') {
            ans += (count(n-1, v, 'i') + count(n-1, v, 'o'));
        }
        ans %= mod;
        map.put(index, ans);
        return ans;
    }
}