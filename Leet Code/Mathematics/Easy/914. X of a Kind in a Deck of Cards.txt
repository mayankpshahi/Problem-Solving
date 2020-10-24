//914. X of a Kind in a Deck of Cards
//7ms

class Solution {

    int gcd(int a,int b){ return b==0?a:gcd(b,a%b);}

    public boolean hasGroupsSizeX(int[] deck) {
        int prevgcd=0;
	Map<Integer,Integer> map = new HashMap<>();
	for(int element:deck) map.put(element,map.getOrDefault(element,0)+1);
	for(int element:map.values()) prevgcd = gcd(prevgcd,element);
	return prevgcd>=2;





    }
}

//1ms

class Solution {

    static int gcd(int a,int b){ return b==0?a:gcd(b,a%b);}

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2)
            return false;

        int max = -1;
        for (int e : deck)
            if (e > max)
                max = e;

        int[] freqs = new int[max + 1];
        for (int e : deck)
            freqs[e]++;

        int res = freqs[0];
        for (int i = 1; i < freqs.length; i++) {
            if (freqs[i] != 0)
                res = gcd(res, freqs[i]);

            if(res == 1)
                return false;
        }

        return true;




    }
}
