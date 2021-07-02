

//658. Find K Closest Elements

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Convert from array to list first to make use of Collections.sort()
        List<Integer> sortedArr = new ArrayList<Integer>();
        for (int num: arr) {
            sortedArr.add(num);
        }
        
        // Sort using custom comparator
        Collections.sort(sortedArr, (num1, num2) -> Math.abs(num1 - x) - Math.abs(num2 - x));
        
        // Only take k elements
        sortedArr = sortedArr.subList(0, k);
        
        // Sort again to have output in ascending order
        Collections.sort(sortedArr);
        return sortedArr;
    }
}



//Other Solution



class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int left = 0, right = nums.length - k;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x - nums[mid] > nums[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        for (int i = left; i < left + k; ++i) {
            res.add(nums[i]);
        }
        return res;
        
    }
}