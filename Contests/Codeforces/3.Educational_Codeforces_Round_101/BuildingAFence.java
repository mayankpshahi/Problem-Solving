

/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class BuildingAFence
{
     
    // System.out.println("Yes");
    // System.out.println("No");
    public static int fun(long a[],long n,long k) {
        long res1=a[1], res2=res1;
    	for(int i=2; i<=n; i++){
    	res1=Math.max(res1+1-k,a[i]);
    	res2=Math.min(res2-1+k,a[i]+k-1);
    	if (res1>res2){
    	    return 0;
    	}
		}
	if(res1<=a[(int)n]&&res2>=a[(int)n]) 
    return 1;
	else 
return 0;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		  long n=sc.nextLong();
		  long k=sc.nextLong();
		 long a[]=new long[(int)n+1];
		 for(int i=1;i<=n;i++)
		 a[i]=sc.nextLong();
        if(fun(a,n,k)==1)
        System.out.println("YES");
        else 
        System.out.println("NO");
		   
		    
		}
	}
}