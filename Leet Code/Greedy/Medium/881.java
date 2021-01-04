class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if (people.length == 0)
		return 0;
	Arrays.sort(people);
     int start = 0;
	int end = people.length - 1;
	int count = 0;
	while (start <= end) {
		if (people[start] + people[end] <= limit)
			start++;
		end--;
		count++;
	}
	return count;
    }
}