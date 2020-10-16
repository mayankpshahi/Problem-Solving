//Reverse a String
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   int t;
	   Scanner s  = new Scanner(System.in);
	   t= s.nextInt();
	   for(int i =0;i<t;i++){
	       //s.next();
	       String s1 = s.next();
	       char [] s2  = s1.toCharArray();
	       for(int j =s2.length -1;j>=0;j--){
	         System.out.print(s2[j]);}
	         System.out.println();


	   }
	}
}
