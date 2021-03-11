
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int t;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		for(int i=0;i<t;i++){
		    int n = s.nextInt();
		    int a[] = new int[n];
		    for(int j=0;j<n;j++){
		        a[j] = s.nextInt();
		    }
		    int maxc = 0;
		    int maxf = 0;
		    boolean c = false;
		    for(int j=0;j<n;j++){
		        if(a[j]>=0&&c==false){
		            maxc++;
		            c =false;
		        }
		        else if(a[j]>=0 && c==true){
		            maxc = 1;
		            c=false;
		        }
		        else if(a[j]<0||j==n-1){
		            c=true;

		        }

		        if(maxc>maxf){
		                maxf = maxc;
		            }
		    }
		    System.out.println(maxf);
		}

	}
}
