

//744. Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0,r=letters.length,mid,n=letters.length ;
        
        while(l <r){
               mid = l + (r - l)/2;
                if(letters[mid] > target) r = mid;
                else l= mid + 1;
              
            }
        
        return letters[l%n];
        
    }
}