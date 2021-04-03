

//1813. Sentence Similarity III

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String arr1 []  = sentence1.split(" ");
        String arr2 []  = sentence2.split(" ");
        
         int i = 0, n1 = arr1.length, n2 = arr2.length;
        
      if (n1 > n2) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        
        while (i < n1 && arr1[i].equals(arr2[i])) {
            ++i;
        }
        while (i < n1 && arr1[i].equals(arr2[n2 - n1 + i])) {
            ++i;
        }
        
        return i == n1;
    }
}

/*
Split the two sentences into words;
Scan the shorter one from left and compare word by word with the longer; Whenever the words from the 2 sentences are not equal, compare the tails of the 2 sentences word by word till the end or they do not match;
Confirm if the pointer reaches the end of shorter sentence. If yes, return true; otherwise, return false.
*/