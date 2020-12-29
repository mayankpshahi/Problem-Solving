

import java.util.*;
 
public class ceilDivisions {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    boolean bol=true;
		    for(int i=0;i<100&&bol;i++){
		        
		    }
			int n = sc.nextInt();
			HashSet<Integer> saving = new HashSet<Integer>();
			ArrayList<Integer> save = new ArrayList<Integer>();
			int temp = n;
			saving.add(temp);
			save.add(temp);
			while(temp > 2&&bol)
			{
				float a = (float)Math.sqrt(temp);
				if(a - (int)a > 0.0)
				{
					temp = (int)a;
					temp++;
				}
				else
					temp = (int)a;
				saving.add(temp);
				save.add(temp);
			}
			int steps = n-1-saving.size() + 2*(saving.size()-1);
			System.out.println(steps);
			for(int i = 2;i < n&&bol;i++)
			{
				if(!saving.contains(i))
					System.out.println(i + " " + n);
			}
			for(int i = 0;bol && i < save.size()-1;i++)
			{
				System.out.println(save.get(i) + " " + save.get(i+1));
				System.out.println(save.get(i) + " " + save.get(i+1));
			}
		}
	}
 
}
