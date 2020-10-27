//1128. Number of Equivalent Domino Pairs

//O(n) 3ms


class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int fin = 0;
        for (int[] d : dominoes) {

            int up = d[0] < d[1] ? d[0] : d[1];
			int down = d[0] < d[1] ? d[1] : d[0];


            fin +=count[up * 10 + down];
            count[up * 10 + down]++;



        }


    return fin;



    }
}



//More Optimized Solution


class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
int ans = 0;
        int[] bucket = new int[100];
        for (int[] domino : dominoes)
            bucket[domino[0] * 10 + domino[1]]++;
        int ten = 0, one = 0;
        for (int i = 11; i < 100; i++) {
            int k = bucket[i]; // for 11,22,33...99, add k*(k-1)/2
            ten = i / 10;
            one = i % 10;
            if (one > ten)
                k += bucket[one * 10 + ten]; // for bucket[12], k= bucket[12]+bucket[21], then add k*(k-1)/2
            else if (one < ten) // for bucket[21], ignore since already counted in bucket[12]
                continue;
            ans += k * (k - 1) / 2;
        }
        return ans;
    }
}
