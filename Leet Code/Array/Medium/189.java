//189. Rotate Array


//O(nk)time Bruteforce O(1)space

class Solution {
    static void rotateone(int[]arr){

        for(int i=1;i<arr.length;i++){
            int p = arr[i];
            arr[i] = arr[0];
            arr[0] = p;

        }

    }

    public void rotate(int[] nums, int k) {

        while(k-->0){
            rotateone(nums);
        }

    }
}

//O(n) time O(n) space

class Solution {
  public void rotate(int[] nums, int k) {
    int[] a = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      a[(i + k) % nums.length] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = a[i];
    }
  }
}


//O(n) time O(1) space

class Solution {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int count = 0;
    for (int start = 0; count < nums.length; start++) {
      int current = start;
      int prev = nums[start];
      do {
        int next = (current + k) % nums.length;
        int temp = nums[next];
        nums[next] = prev;
        prev = temp;
        current = next;
        count++;
      } while (start != current);
    }
  }
}




//O(n) time O(1) space
class Solution {
    static void reverse(int[]arr,int start,int end){
       while (start < end) {
      int t = arr[start];
      arr[start] = arr[end];
      arr[end] = t;
      start++;
      end--;
    }


    }

    public void rotate(int[] nums, int k) {
    k%=nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);

    }
}
