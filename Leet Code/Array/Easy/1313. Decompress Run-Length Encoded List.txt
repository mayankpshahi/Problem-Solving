My Solution

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int size = 0;
        for(int i = 0;i<nums.length-1;i+=2){
            size += nums[i];
        }
        int []output = new int[size];
        int k=0;
        for(int i = 0;i<nums.length-1;i+=2){
            int p = nums[i];
            while(p>0){
                output[k] = nums[i+1];
                k++;
                p--;
            }
        }
        return output;
    }
}


ArrayList Solution

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        // create an arrayList to have a dynamically sized array
       List<Integer> intList = new ArrayList<Integer>(nums.length);
        
        // iterate thru the nums array for each pair
        for (int i = 0; i < nums.length; i += 2) {
            // the first number will be the frequency
            int freq = nums[i];
            // the next number will be the number being added into the array, freq. times
            int next_num = nums[i + 1];
            // for loop to add the next_num, frequency amount of times
            for(int j = 0; j < freq; j++){
                intList.add(next_num);
            }
        }
        
        // create an int array with the size of ArrayList
        int[] ret_array = new int[intList.size()];
        // create an iterator to iterate thru the arrayList
        Iterator<Integer> iterator = intList.iterator();
        // insert all the arrayList values inside the return int array
        for (int i = 0; i < ret_array.length; i++) {
            ret_array[i] = iterator.next().intValue();
        }
        // return the array getting the answer
        return ret_array;
    }
}

Best Solution

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int size = 0;
        for(int i = 0;i<nums.length-1;i+=2){
            size += nums[i];
        }
        int []output = new int[size];
        int index = 0;
        
        for(int i = 0; i < nums.length; i += 2) {
            Arrays.fill(output, index, index + nums[i], nums[i + 1]); //This is fast
            index += nums[i];
        }
        return output;
    }
}