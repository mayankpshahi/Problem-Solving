//Find Transition Point

import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    static int binaryFind(int arr[],int l,int r){
        if(r>=l){

            if(arr[arr.length-1]==0)
            return -1;

            if(arr[0]==1)
            return 0;

            int mid = (l+(r-1))/2;
            if(arr[mid]==1 && arr[mid-1]==0)
            return mid;

            if(arr[mid]==0 && arr[mid+1]==1)
            return mid+1;



            if(arr[mid]==1 && arr[mid-1]==1)
            return binaryFind(arr,l,mid-1);

            if(arr[mid]==0 && arr[mid+1]==0)
            return binaryFind(arr,mid + 1,r);

        }

        return -2;
    }


    int transitionPoint(int arr[], int n) {
        // code here

        int p = binaryFind(arr,0,n-1);
        return p;



    }
}
