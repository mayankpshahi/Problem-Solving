//Kth smallest element in array.
/* 1. Brute force

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	public static void main (String[] args) {
		//code
		Scanner sc =  new Scanner(System.in);
		int t =  sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    int k = sc.nextInt();
		    Arrays.sort(a);
		    System.out.println(a[k-1]);
		    t--;



		}

	}
}

*/

// Time Complexity: Building the min heap of n elements + Extracting min element K-1 times = O(n) + (K-1) * log(n) = O( n + Klogn)
// 2. Implementing minHeap by using priority queue



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{


	public static void main (String[] args) {
		//code
		Scanner sc =  new Scanner(System.in);
		int t =  sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();

		    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		    for(int i=0;i<n;i++){

		        pQueue.add(sc.nextInt());
		    }
		    int k = sc.nextInt();

		    while(k>1){
		        pQueue.poll();
		        k--;
		    }
		    Iterator itr = pQueue.iterator();
		    System.out.println(itr.next());


		    t--;



		}

	}
}
// O(n) solution using Quick Select by modifying quickSort according to GFG
/*


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{

static int findMedian(int arr[], int i,int n)
{
    if(i <= n)
        Arrays.sort(arr, i, n);
    else
        Arrays.sort(arr, n, i);
    return arr[n/2];
}

static int kthSmallest(int arr[], int l, int r, int k)
{

    if (k > 0 && k <= r - l + 1)
    {
        int n = r - l + 1 ;


        int i;


        int []median = new int[(n + 4) / 5];
        for (i = 0; i < n/5; i++)
            median[i] = findMedian(arr,l + i * 5, 5);


        if (i*5 < n)
        {
            median[i] = findMedian(arr,l + i * 5, n % 5);
            i++;
        }


        int medOfMed = (i == 1)? median[i - 1]:
                                kthSmallest(median, 0, i - 1, i / 2);


        int pos = partition(arr, l, r, medOfMed);


        if (pos-l == k - 1)
            return arr[pos];
        if (pos-l > k - 1)
            return kthSmallest(arr, l, pos - 1, k);


        return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
    }


    return Integer.MAX_VALUE;
}

static int[] swap(int []arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
}


static int partition(int arr[], int l,
                        int r, int x)
{

    int i;
    for (i = l; i < r; i++)
        if (arr[i] == x)
        break;
    swap(arr, i, r);


    i = l;
    for (int j = l; j <= r - 1; j++)
    {
        if (arr[j] <= x)
        {
            swap(arr, i, j);
            i++;
        }
    }
    swap(arr, i, r);
    return i;
}


public static void main (String[] args) {
		//code
		Scanner sc =  new Scanner(System.in);
		int t =  sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();

		    int a[] =  new int[n];
		    for(int i=0;i<n;i++){

		        a[i] = sc.nextInt();
		    }
		    int k = sc.nextInt();


		    System.out.println(kthSmallest(a, 0, n-1, k));


		    t--;



		}

	}
}
*/
