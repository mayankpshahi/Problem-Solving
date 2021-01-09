//1716. Calculate Money in Leetcode Bank

class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int div  =  n/7;
        
        int div1 =div+1;
        
        int rem = n%7;
        if(div>=1){
            sum=28;
            div--;
        }
        
        int p =sum;
        
        while(div-->0){
            p+=7;
           
            sum+=p;
             
        }
        while(rem-->0){
            sum+=div1;
            div1+=1;
             
        }
        
        return sum;
        
    }
}