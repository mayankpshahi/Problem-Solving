//767. Reorganize String

//O(n)
class Solution {
    public String reorganizeString(String S) {
        int[] count = new int[26];
        for (int i = 0; i < S.length(); i++) {
            count[S.charAt(i) - 'a']++;
        } 
        int max = 0, letter = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                letter = i;
            }
        }
        if (max > (S.length() + 1) / 2) {
            return ""; 
        }
        char[] res = new char[S.length()];
        int index = 0;
        while (count[letter] > 0) {
            res[index] = (char) (letter + 'a');
            index += 2;
            count[letter]--;
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (index >= res.length) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
                count[i]--;
            }
        }
        return String.valueOf(res);
        
    }
}

//Priority Queue Max heap Solution

// Algorithm:
    // 1. Idea is to store all the characters and their occurances in a hashmap
    // 2. Sort the map with the help of a max heap by moving all the duplicates to the left side
    // 3. Initialize a Map.Entry variable to keep track of the previous entry in the priority queue
    // 4. Initialize a string builder to add back the characters in the expected order
    // 5. Run a while loop over the priority queue and poll the element from the priority queue
    // 6. We check if the previous entry is not null and its check whether its value 
	// (the number of occurances of this character) is greater than 0 and add it to the
	// queue otherwise we add the current entry's key to the string builder and decrement its occurance by 1
    // 7. Update the previous entry with current entry (as mentioned above, we could have
	// mulitple occurances of a character in the map, so we want to keep a track of the 
	// current entry by assigning it to the previous entry and handle the condition to add this 
	// element to the queue or not as pointed out in the previous step
    // 8. At this point, once the loop rolles out, we check if the string builders length is equal to the 
	// length of the input string and return the string builder as string otherwise we return ""
class Solution {
    
    public String reorganizeString(String S) {
        Map<Character, Integer> map = new HashMap();
        for(char ch : S.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        Map.Entry<Character, Integer> previousEntry = null;
        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();
            if(previousEntry != null && previousEntry.getValue() > 0) {
                maxHeap.offer(previousEntry);
            }
            sb.append(currentEntry.getKey());
            currentEntry.setValue(currentEntry.getValue()-1);
            previousEntry = currentEntry;
        }
        
        return sb.toString().length() == S.length() ? sb.toString() : "";
    }
}