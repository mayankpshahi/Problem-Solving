

//Sort an array of 0s, 1s and 2s

class Solution
{
    public static void sort012(int arr[], int n)
    {
        // code here
        int cnt0  = 0,cnt1=0;
        for(int i:arr){
            if(i==0) cnt0++;
            if(i==1) cnt1++;
        }
        int i=0;
        for(i=0;i<cnt0;i++)arr[i]=0;
        for(;i<cnt0+cnt1;i++)arr[i]=1;
        for(;i<n;i++)arr[i]=2;
    }
}