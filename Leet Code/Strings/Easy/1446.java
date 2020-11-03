//1446. Consecutive Characters

//O(n)
class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;
        if(s.length()==0) return 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                count++;
            else{
                if(max<count)max =  count;
                count = 1;
            }

        }
        if(max<count)max =  count;
        return max;


    }
}
