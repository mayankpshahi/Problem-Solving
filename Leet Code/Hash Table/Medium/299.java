//299. Bulls and Cows


class Solution {
    public String getHint(String secret, String guess) {
    int countA = 0;
    int countB = 0;
    int[] cows = new int[10];
    for (int i = 0; i<secret.length(); i++) {
        if (secret.charAt(i) == guess.charAt(i)) countA++;
        else {
            if (cows[secret.charAt(i)-'0'] < 0)
                countB++;
               
                
            if (cows[guess.charAt(i)-'0'] > 0)
                countB++;
                
        
            cows[secret.charAt(i)-'0']++;
            cows[guess.charAt(i)-'0']--;
                                               
        }
    }
    return countA + "A" + countB + "B";
    }
}