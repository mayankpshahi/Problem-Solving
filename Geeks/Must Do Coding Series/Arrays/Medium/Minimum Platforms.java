
//Minimum Platforms

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        //Sort the events
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platform = 0, count =1,i=1,j=0;
        
        while(i<n && j<n){
            if(arr[i]<=dep[j]){ 
                count++;
                i++;
            }else{
                count--;
                j++;
            }
            
            if(count>platform) platform = count;
        }
        
        return platform;
        
    }
    
}

