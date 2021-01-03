
//1704. Determine if String Halves Are Alike

class Solution {
    public boolean halvesAreAlike(String s) {
        int freq=0;
        for(int i= 0;i<s.length();i++){
            if(i<s.length()/2){
                if(s.charAt(i)=='a'|| s.charAt(i)=='A'||s.charAt(i)=='e'|| s.charAt(i)=='E'||s.charAt(i)=='i'|| s.charAt(i)=='I'||s.charAt(i)=='o'|| s.charAt(i)=='O'||s.charAt(i)=='u'|| s.charAt(i)=='U') freq++;
            }else{
                if(s.charAt(i)=='a'|| s.charAt(i)=='A'||s.charAt(i)=='e'|| s.charAt(i)=='E'||s.charAt(i)=='i'|| s.charAt(i)=='I'||s.charAt(i)=='o'|| s.charAt(i)=='O'||s.charAt(i)=='u'|| s.charAt(i)=='U') freq--;
            }
            
        }
        if(freq==0) return true;
        else return false;
        
    }
}