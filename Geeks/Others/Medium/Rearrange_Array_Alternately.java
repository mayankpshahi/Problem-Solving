//Rearrange Array Alternately

import java.util.*;
import java.lang.*;
import java.io.*;

class Rearrange {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);

// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

         //testcases
        int t = Integer.parseInt(read.readLine());

		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    int[] temp= new int[n];

		    String str[] = read.readLine().trim().split(" ");

		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        temp[i] = Integer.parseInt(str[i]);

		    // StringBuffer sb = new StringBuffer();

		    RearrangeAlternate obj = new RearrangeAlternate();

		    //calling rearrange() function
		    obj.rearrange(temp, n);
		    StringBuffer sb = new StringBuffer();

		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(temp[i] + " ");
		    System.out.println(sb);
		}
	}
}



// } Driver Code Ends


class RearrangeAlternate{

    // This function wants you to rearrange the temp array as required
    // and returns a StringBuffer with all elements of modified temp array
    // appended to it.
    // temp: input array
    // n: size of array
    public static void rearrange(int arr[], int n){

        int max_idx = n - 1, min_idx = 0;

        int max = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max) * max;
                max_idx--;
            }
            else {
                arr[i] += (arr[min_idx] % max) * max;
                min_idx++;
            }
        }

        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max;


    }

}
