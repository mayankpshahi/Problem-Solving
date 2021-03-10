

//Merge Without Extra Space

class Solution
{
    
     static int nextGap(int gap)
    {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
         int gap = n + m;
        gap = nextGap(gap);
        while(gap>0){
            int i,j;
        for (i = 0; i + gap < n; i++){
                if (arr1[i] > arr1[i + gap]) {
                    long p = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = p;
                }}
            if(gap > n)
            j = gap - n;
            else
            j=0;


        for (; i < n && j < m;i++, j++){
                if (arr1[i] > arr2[j]) {
                    long p = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = p;
                }}
        if (j < m) {
            for (j = 0; j + gap < m; j++){
                    if (arr2[j] > arr2[j + gap]) {
                        long p = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = p;
                    }
            }

        }



         gap = nextGap(gap);


    }
    }
}