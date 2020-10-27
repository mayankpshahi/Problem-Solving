//202. Happy Number

//1ms HashSet Solution

class Solution {

    static int sumSquare(int n){
        int sum = 0;
        while(n>0){
            int p = n%10;
            sum+=(p*p);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n<=0)
            return false;
        Set<Integer> s = new HashSet<Integer>();;

        while(s.contains(n) == false){
            s.add(n);
            n = sumSquare(n);
            if(n==1)
                return true;
        }
        return false;
    }
}

// 1ms Two pointer Solution


class Solution {

    static int sumSquare(int n){
        int sum = 0;
        while(n>0){
            int p = n%10;
            sum+=(p*p);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n<=0)
            return false;
        int slow_sum = n;
        int fast_sum = sumSquare(n);

        if(slow_sum == 1 || fast_sum==1)
            return true;
        while(slow_sum!=fast_sum){
            slow_sum = sumSquare(slow_sum);
            fast_sum = sumSquare(sumSquare(fast_sum));
            if(slow_sum == 1 || fast_sum==1)
                return true;
        }
        return false;

    }
}


//0ms

class Solution {
    public boolean isHappy(int n) {
      if(n==3||n==4||n==5){
          return false;
      }

      while(n!=1){
          n=dSum(n);
              if(n==3||n==4||n==5){
          return false;
      }
      }

        return true;

    }

    public int dSum(int n){

        int sum =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum +=rem*rem ;

        }

        return sum;

    }


}
