//168. Excel Sheet Column Title



class Solution {
    public String convertToTitle(int n) {

        if(n<=0)
            return "";

        StringBuilder s  = new StringBuilder("");

        int a = 0;

        while(n>0){
            n--;
            a = n%26;
            s.append((char)('A' + a));
            n/=26;
        }

        s.reverse();
        String fin = new String(s);
        return fin;





    }
}
