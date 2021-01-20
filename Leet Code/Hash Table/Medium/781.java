//781. Rabbits in Forest


class Solution {
    public int numRabbits(int[] answers) {
         Map<Integer, Integer> m = new HashMap<>();
        
        for (int i : answers)
            m.put(i, m.getOrDefault(i, 0) + 1);
        
        int rabbits = 0;
        for (int i : m.keySet())
            rabbits += (m.get(i) + i) / (i + 1) * (i + 1);
        
        return rabbits;
    }
}