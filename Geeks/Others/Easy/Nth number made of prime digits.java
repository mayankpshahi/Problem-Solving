
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static String nthPrime(int num){
        int rem;
        String s = "";
        while(num>0){
            rem = num%4;
            switch(rem){
                case 1:
                    s+='2';
                    break;
                case 2:
                    s+='3';
                    break;
                case 3:
                    s+='5';
                    break;
                case 0:
                    s+='7';
                    break;
            }
            if(num%4==0){num--;}
            num = num/4;

        }
         return new StringBuilder(s).reverse().toString();


    }
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++){
		    int num = s.nextInt();
		    System.out.println(nthPrime(num));
		}

	}
}
