

//1641. Count Sorted Vowel Strings


class Solution {
    private int count = 0;
    public int countVowelStrings(int n) {
        char vowel []  = {'a','e','i','o','u'};
        
        if(n==1) return 5;
        else{
            List<Character> subset = new ArrayList<>();
            backtrack(vowel,n, subset,0);
            return count;
        }
        
    }
     public void backtrack(char vowel[],int n, List<Character> subset, int ind) {
    if (subset.size() == n) {
        count++;
        return;
    }
    for (int i = ind; i < vowel.length; i++) {
         
        subset.add(vowel[i]);
        backtrack(vowel,n, new ArrayList<>(subset), i);
        subset.remove(subset.size() - 1);
         
    }
    return;
}
}