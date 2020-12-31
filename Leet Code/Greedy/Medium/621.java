//621. Task Scheduler

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c: tasks)freq[c - 'A']++;
        
        Arrays.sort(freq);
        int max_val = freq[25] - 1;
        int idle_slots = max_val*n;
        
        for(int i=24;i>=0;i--){
            idle_slots -= Math.min(freq[i],max_val); 
        }
        
        return idle_slots>0 ? idle_slots + tasks.length : tasks.length;
        
    }
}