


//45. Jump Game II


class Solution {
    public int jump(int[] arr) {
         int max =0 ,jump =0 , halt =0;
       if(arr[0]==0){
           return 0;
       }
       for(int  i =0;i<arr.length-1;i++){
           max = Math.max(max,i+arr[i]);
           if(max>=arr.length-1){
               jump+=1;
               return jump;
               
           }
           if(i== halt){
               halt= max;
               jump++;
           }
       }
       if(halt>=arr.length-1){
           return jump;
       }
       return jump;
        
    }
}