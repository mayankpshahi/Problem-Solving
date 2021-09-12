


//55. Jump Game


class Solution {
    public boolean canJump(int[] arr) {
         int max =0 , halt =0;
       if(arr.length==1) return true;
       if(arr[0]==0){
           return false;
       }
       for(int  i =0;i<arr.length-1 && i<=halt;i++){
           max = Math.max(max,i+arr[i]);
           //if(arr[i]==0) return false;
           if(max>=arr.length-1){
               
               return true;
               
           }
           if(i== halt){
               halt= max;
               
           }
       }
       if(halt>=arr.length-1){
           return true;
       }
       return false;
    }
}