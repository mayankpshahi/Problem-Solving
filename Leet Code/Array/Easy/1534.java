My Solution

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(Math.abs(arr[i]-arr[j])<=a)
                {
                    for(int k=j+1;k<arr.length;k++)
                    {
                        if(Math.abs(arr[j]-arr[k])<=b&&Math.abs(arr[i]-arr[k])<=c)
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
        
    }
}

Second Solution

int count = 0, n =arr.length;
        for(int i = 0;i < n-2;i++) {
            for(int j =i+1;j < n-1;j++) {
                if((int)Math.abs(arr[i] - arr[j]) > a) continue;
                for(int k = j+1;k < n;k++) {
                    if((int)Math.abs(arr[j] - arr[k]) > b || (int)Math.abs(arr[i] - arr[k]) > c) continue;
                    count++;
                }
            }
        }
        return count;

