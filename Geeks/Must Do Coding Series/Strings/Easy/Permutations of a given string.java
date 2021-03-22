
//Permutations of a given string

class Solution {
    List<String> list  =  new ArrayList<String>();
     public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
     private void permute(String str, int left, int right) 
    { 
        if (left == right) 
            list.add(str); 
        else
        { 
            for (int i = left; i <= right; i++) 
            { 
                str = swap(str,left,i); 
                permute(str, left+1, right); 
                str = swap(str,left,i); 
            } 
        } 
    } 
    public List<String> find_permutation(String S) {
        // Code here
        
        permute(S, 0, S.length()-1);
        Collections.sort(list);
        
        return list;
    }
}