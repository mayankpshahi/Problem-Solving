//Reverse an Array
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    int start = 0;
		    int last = n-1;
		    int temp;
		    while(start<last){
		       temp=a[start];
		       a[start] = a[last];
		       a[last] = temp;
		       start++;
		       last--;
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(a[i]);
		        System.out.print(" ");

		    }
		    System.out.println();
		    t--;


		}
	}
}
