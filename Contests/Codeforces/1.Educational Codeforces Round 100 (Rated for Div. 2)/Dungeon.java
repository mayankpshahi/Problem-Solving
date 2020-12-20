import java.util.*;
public final class Dungeon{
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int  b = sc.nextInt();
            int c = sc.nextInt();

            long sum  = a+b+c;
            int x = (int)sum/9;
            
                if(x<=a&&x<=b&&x<=c&&sum%9==0){
                    System.out.println("YES");
                   
                }else{
                    System.out.println("NO");
                    
                }
            }
            sc.close();



        }



    }
}