//633. Sum of Square Numbers

//Bruteforce - TLE

class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i = 0;i*i<=c;i++){
            for(int j = 0;j*j<=c;j++){
                if(i*i + j*j == c)
                    return true;
            }

        }
        return false;
    }
}

//O(sqrt(n) * logn) - 4ms

class Solution {
    public boolean judgeSquareSum(int c) {
        int j;

        for(int i = 0;i * i<=c/2;i++){
            j=i*i;
            int b = c -j;
            int bcheck = (int)Math.sqrt(b);

            if(j + (bcheck * bcheck) == c)
                return true;

        }
        return false;

    }
}



//Best Solution -3ms

class Solution {
    public boolean judgeSquareSum(int c) {
      if(c<0)return true;
        int l = 0;
        int r = (int) Math.sqrt(c);
        while(l<=r){
            int m = l * l + r * r;
            if(m<c) l++;
            if(m>c) r--;
            if(m==c) return true;
        }
        return false;
    }
}
