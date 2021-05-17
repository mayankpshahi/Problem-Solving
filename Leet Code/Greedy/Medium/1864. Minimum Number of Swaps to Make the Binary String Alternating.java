

//1864. Minimum Number of Swaps to Make the Binary String Alternating


class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int ones = 0,zeros =0;
        for(char c:s.toCharArray()){
            if(c=='1')ones++;
            else if(c=='0')zeros++;
        }
        
        if (Math.abs(ones - zeros) > 1)
            return -1;
        if (ones > zeros)
            return swapsCount(s, '1');
        else if (zeros > ones)
            return swapsCount(s, '0');
        return Math.min(swapsCount(s, '1'), swapsCount(s, '0'));
        
    }
    
    public int swapsCount(String s, char current) {
        int swaps = 0;
        for (char ch : s.toCharArray()) {
            if (ch != current) {
                swaps += 1;
            }
            if (current == '1')
                current = '0';
            else
                current = '1';
        }
        return swaps / 2;
    }
}