

//1863. Sum of All Subset XOR Totals

class Solution {
    public int subsetXORSum(int[] nums) {
        
        int n = nums.length, bits = 0;
        for (int i=0; i < n; ++i)
            bits |= nums[i];
        int res = bits *((int) Math.pow(2, n-1));
        return res;
    }
}

/*
The idea is

	1 = 001
    5 = 101
    6 = 110
1 ^ 5 = 100
1 ^ 6 = 111
5 ^ 6 = 011
1^5^6 = 010
-> once we observe all these binary number of the XORs, we can observe that set bit occurs at all the position of i (o<=i<n) will exactly contribute to half of pow(2,n).

Note: 2^n represents pow(2,n), used the same notation for XOR in above example but not in the following cases.

Why exactly half of 2^n??

Consider the size of nums array is n and m elements in nums have i th bit set.
Now, to have a subset with ith bit set in its xor, we need it to have odd number of elements with ith bit set or else xor will become 0.
Number of ways of choosing elements with ith bit not set = 2^(n-m).
Also, Number of ways of choosing elements with ith bit set = mC1 + mC3 + mC5 …. = 2^(m-1)
So that we get total number of ways = 2^(n-1) which is exactly half of 2^n.
Now, we have two conditions:

If there is any value of nums that has set ith bit set, then exactly half of 2^n subsets will be of the form, so they will contribute to 2^(n-1+i) to the final sum.
If there is no value of nums that ith bit set, then we can say that there will be no term in all subsets that have a ith bit set.
-> Now the question is to check which position of element of the nums will be set or not. But instead of iterating for all elements , we can use a trick that is simply take the OR of all such values and multiply with 2^(n-1)
Take a OR of all  elements, we get 
= 1 | 5 | 6
= 001 | 101 | 110
= 111
Now to find final summation, 
= 1*2^(n-1+2) + 1*2^(n-1+1) + 1*2^(n-1+0)
= 2^(n-1) * (1*2^2 + 1*2^1 + 1*2^0 )
= 2^(n-1) * 7
so final result will be putting n=3, 
= 28
*/



//Second Approach


class Solution {
    public int subsetXORSum(int[] nums) {
     
        int n = nums.length;
        int tmp = 0;
        int sum = 0;
  
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++) {
           tmp = 0;
            for (int j = 0; j < n; j++) {
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                System.out.println("i= "+i+" j= "+j + " 1<<j = "+(1<<j)+ " i & (1 << j) =  " +(i & (1 << j)));
                
                if ((i & (1 << j)) > 0) {
                  tmp = tmp ^ nums[j];
                  System.out.println("nums[j] = "+nums[j]);
                  System.out.println("tmp = "+tmp);
                }
            }
           sum+=tmp;
           System.out.println("sum = "+sum);
        }
      return sum;
    }
}