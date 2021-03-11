//Sort an array of 0s, 1s and 2s


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]  = sc.nextInt();
		    }
		    int a_0=0,a_1=0,a_2 = 0;
		    for(int i=0;i<n;i++){
		        if(a[i]==0)
		        a_0++;
		        else if(a[i] == 1)
		        a_1++;
		    }
		    a_2 = n-(a_0 + a_1);
		    while(a_0>0){
		        System.out.print("0"+" ");
		        a_0--;
		    }
		    while(a_1>0){
		        System.out.print("1"+" ");
		        a_1--;
		    }
		    while(a_2>0){
		        System.out.print("2"+" ");
		        a_2--;
		    }


		    System.out.println();

		    t--;

		}

	}
}
