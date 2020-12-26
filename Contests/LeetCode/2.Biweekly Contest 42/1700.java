//1700. Number of Students Unable to Eat Lunch


class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] countZeroAndOne = new int[2];
	for (int i: students) countZeroAndOne[i]++;
	for (int i=0;i<sandwiches.length;i++) 
		if (--countZeroAndOne[sandwiches[i]] < 0) return sandwiches.length - i;
	return 0;
        
        
    }
}