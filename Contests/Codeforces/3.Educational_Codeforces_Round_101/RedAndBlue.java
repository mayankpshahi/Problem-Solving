

import java.util.Scanner;
 
public class RedAndBlue
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int s1=0;
			int s2=0;
			int max1=0;
			int max2=0;
			int n=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				s1+=sc.nextInt();
				if(s1>max1)
					max1=s1;
			}
			int m=sc.nextInt();
			for(int j=0;j<m;j++)
			{
				s2+=sc.nextInt();
				if(s2>max2)
					max2=s2;
			}
			System.out.println(max1+max2);
		}
	}
}