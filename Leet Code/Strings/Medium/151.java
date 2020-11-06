//151. Reverse Words in a String

//O(n)
class Solution {
    public String reverseWords(String s) {

        String [] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int end = s1.length - 1;
        for(int i = 0; i<= end; i++){
            if(!s1[i].isEmpty()) {
                sb.insert(0, s1[i]);
                if(i < end) sb.insert(0, " ");
            }
        }
        return sb.toString();
    }
}
