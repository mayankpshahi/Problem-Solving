

//1844. Replace All Digits with Characters

class Solution {
    public String replaceDigits(String s) {
        char arr[] =  s.toCharArray();
        //System.out.println(arr[i-1]+)
        for(int i=1;i<arr.length;i+=2){
            if(i%2==1)
            arr[i] = (char)(arr[i-1] + (arr[i]-'0'));
            
        }
        
        return String.valueOf(arr);
        
    }
}