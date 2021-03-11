
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int t;
		int n;
		Scanner s = new Scanner(System.in);
		t =  s.nextInt();
		for(int i=0;i<t;i++){
		    int count = 1;
		   n = s.nextInt();
		   int a[] = new int[n];
		   for(int j=0;j<n;j++){
		       a[j] = s.nextInt();
		   }
		   MergeSort ob = new MergeSort();
		   ob.sort(a,0,n-1);

		   for(int j=0;j<n-1;j++){
		       if(a[j]+1!=a[j+1]){
		           count++;
		       }
		   }

		   System.out.println(count);







		}

	}
}
class MergeSort {
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];



        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;


            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

}
