



//493. Reverse Pairs



class Solution {
    public static int merge(int arr[],int temp[],int left,int mid,int right){
        int i,j,k;
        int count = 0;
        i = left; //points to left subarray
        j =  mid+1;//points to right subarray
        k = left;// points to merge subarray;
        
         int x=left;
        for(int z=j;z<=right;z++){
            while( x<=mid && arr[x] <= 2L*arr[z]){
                x++;
            }
            count += (mid-x) + 1;
        }
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];//correct order same as array so no inversion
            }
            else{
                temp[k++] = arr[j++];//inversions occurs in this case
                //count +=(mid - i+1);//everything on the right of i in left subarray 
                //will be a inversion pair for current element j in right subarray
            }
   
        }
        while(i<=mid)
            temp[k++] = arr[i++];
        
        while(j<=right)
            temp[k++] = arr[j++];
        
        for(i=left;i<=right;i++)
            arr[i]=temp[i];
        
        return count;
    }
    public static int mergeSort(int arr[],int temp[],int left,int right){
        int mid;
        int count = 0;
        if(left<right){
            mid = (left + right)/2;
            count+=mergeSort(arr,temp,left,mid);
            count+=mergeSort(arr,temp,mid+1,right);
            count+=merge(arr,temp,left,mid,right);
            
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int temp[] =  new int[n];
        int count = mergeSort(nums,temp,0,n-1);
        
        return count;
        
    }
}