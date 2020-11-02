//11. Container With Most Water

//O(n^2)

class Solution {
    public int maxArea(int[] height) {
         int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;

    }
}


//O(n)

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if(n<=1) return 0;
	int i=0,j=n-1;
	int maxArea = 0;

	while(i<j){
	    maxArea = Math.max((j-i) * Math.min(height[i], height[j]), maxArea);
        if(height[i] < height[j]){
            int temp = i+1;
            while(temp < j && height[temp] <= height[i]){
                temp++;
            }
            i = temp;
        } else {
            int temp = j-1;
            while(temp > i && height[temp] <= height[j]){
                temp--;
            }
            j = temp;
        };
    }
    return maxArea;
    }
}
