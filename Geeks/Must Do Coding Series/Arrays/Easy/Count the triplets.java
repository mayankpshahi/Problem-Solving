


// Count the triplets 

class Solution {
    int countTriplet(int arr[], int n) {
        
        //Sort the array than check triplets by fixing i.
         Arrays.sort(arr);
         
    int j,k,count=0;
    for(int i=0;i<n-2;i++)
    {
        j=i+1;
        k=j+1;
        while(k<n)
        {
            if(arr[i]+arr[j]==arr[k])
            {
                count++;
                j++;
        
            }
            else if(arr[i]+arr[j]<arr[k])
            {
                j++;
                k--;
            }
            k++; 
        }
    }
    return count;
        
    }
}