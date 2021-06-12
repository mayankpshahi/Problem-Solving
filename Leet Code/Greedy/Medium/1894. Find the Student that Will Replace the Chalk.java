


//1894. Find the Student that Will Replace the Chalk




class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int index = 0;
        long val = 0;
        for(int i = 0; i < chalk.length; i++){
            val += chalk[i];
        }
        if(val < k){
            k = k%((int)val);
        }
        while(chalk[index] <= k){
            k = k - chalk[index];
            index++;
            if(index == chalk.length)
                index = 0;
        }
        return index;
        
    }
}