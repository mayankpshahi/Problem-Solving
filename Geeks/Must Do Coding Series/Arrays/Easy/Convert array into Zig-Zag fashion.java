
//Convert array into Zig-Zag fashion

class Solution {
    void zigZag(int arr[], int n) {
        // code here
        boolean f = true;
        
        for(int i=0;i< n -1 ;i++){
            if(f){
                if(arr[i]>arr[i+1]){
                    int swap =  arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                }
            }else{
                if (arr[i] < arr[i+1])  
                {  
                     
                  int swap = arr[i];  
                    arr[i] = arr[i+1];  
                    arr[i+1] = swap;  
                }  
            }
            
            f=!f;
            
        }
    }

}