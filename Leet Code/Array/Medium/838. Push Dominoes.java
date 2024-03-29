




//838. Push Dominoes


class Solution {
    public String pushDominoes(String dominoes) {
        
        char arr[] =  new char[dominoes.length() + 2];
        arr[0] = 'L';
        arr[arr.length-1] = 'R';
        
         for(int i=1;i<arr.length-1;i++){
            arr[i]=dominoes.charAt(i-1);
        }
        
        int i=0;
        int j=1;
        
        while(j<arr.length){
            while(arr[j]=='.') j++;
            
            if(arr[i]=='L' && arr[j]=='L'){
                while(i!=j){
                    arr[i]='L';
                    i++;
                }
                j++;
            }else if(arr[i]=='L' && arr[j]=='R'){
                i=j;
                j++;
            }else if(arr[i]=='R' && arr[j]=='R'){
                while(i!=j){
                    arr[i]='R';
                    i++;
                }
                j++;
            }else if(arr[i]=='R' && arr[j]=='L'){
                 int start=i+1;
                 int end=j-1;
                 while(start<end){
                     arr[start]='R';
                     arr[end]='L';
                     start++;
                     end--;
                 }
                i=j;
                j++;
            }
        }
        
        StringBuilder sb  =  new StringBuilder();
        for(i=1;i<arr.length-1;i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}