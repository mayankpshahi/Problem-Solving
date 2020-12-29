import java.util.*;
import java.io.PrintWriter;
import java.io.File;
import java.util.stream.IntStream;
 
public class RegularBracket{
 
    public static boolean isBalanced(String exp)
    {
 
        boolean bool = true;
        int count = 0;
 
        for(int i = 0; i < exp.length(); i++)
        {
            if (exp.charAt(i) == '(')
            {
                count++;
            }
            else
            {
 
                count--;
            }
            if (count < 0)
            {
                bool = false;
                break;
            }
        }
 
        if (count != 0)
        {
            bool = false;
        }
        return bool;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String str = scanner.nextLine();
            if (str.charAt(0) == ')') {
                System.out.println("NO");
                continue;
            }
            if (str.charAt(str.length()-1) == '(') {
                System.out.println("NO");
                continue;
            }
            int numquestion = 0;
 
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '?') {
                    numquestion++;
                }
 
            }
            if (numquestion == 0) {
                if (isBalanced(str)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            } else if (numquestion == (str.length()-1)) {
                if (numquestion % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            if ((numquestion >= (str.length()) - numquestion) && (numquestion%2==0) ){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
 
        }
 
    }
}