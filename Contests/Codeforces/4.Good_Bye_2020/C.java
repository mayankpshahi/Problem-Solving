


import java.util.*;

public final class C{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
          String str = sc.next();
          char [] ch = str.toCharArray();
          int count = 0;
          for (int i =1;i < str.length();i++){
              if(ch[i]==ch[i-1])
                 ch[i]='X';
              else if(((i-2)>=0)&& (ch[i] == ch[i-2]))
                  ch[i] = 'X';

          }
          for (int i =1;i < str.length();i++){
              if(ch[i]=='X')
                 count++;
          }
          System.out.println(count);


            
           
            

        }
        

    }
}