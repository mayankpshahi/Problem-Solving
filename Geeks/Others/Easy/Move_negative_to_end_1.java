// Move all negative elements to end order can be changed
//Quick Sort partition technique
/*import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static void moveToEnd(int a[],int n){
     int j = 0,q;

	    for(int i = 0;i<n;i++){
	        if(a[i]>0){
	            if(i!=j){
	                q = a[i];
	                a[i] = a[j];
	                a[j] = q;
	            }
	            j++;
	        }

	    }
    }





	public static void main (String[] args) {
	Scanner sc =  new Scanner(System.in);
	int t = sc.nextInt();

	while(t>0){


	    int n = sc.nextInt();
	    int a[] = new int[n];

	    for(int i = 0;i<n;i++){
	        a[i] = sc.nextInt();
	    }

	    moveToEnd(a,n);
	    for(int i = 0;i<n;i++){
	        System.out.print(a[i]+" ");
	    }

	    System.out.println();


	    t--;

	}


	}
}*/


// Two pointer approach

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static void moveToEnd(int a[],int left,int right){
        while(left<=right){
            if (a[left] > 0 && a[right] > 0)
            left+=1;
            else if(a[left]<0 && a[right]>0){
                int t=a[left];
                a[left]=a[right];
                a[right]=t;
                left+=1;
                right-=1;
            }
            else if (a[left] < 0 && a[right] < 0)
            right-=1;
            else{
                left+=1;
                right-=1;
            }







        }


    }





	public static void main (String[] args) {
	Scanner sc =  new Scanner(System.in);
	int t = sc.nextInt();

	while(t>0){


	    int n = sc.nextInt();
	    int a[] = new int[n];

	    for(int i = 0;i<n;i++){
	        a[i] = sc.nextInt();
	    }

	    moveToEnd(a,0,n-1);
	    for(int i = 0;i<n;++i){
	        System.out.print(a[i]+" ");
	    }

	    System.out.println();


	    t--;

	}


	}
}
